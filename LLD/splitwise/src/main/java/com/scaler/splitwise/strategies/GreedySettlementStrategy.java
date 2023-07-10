package com.scaler.splitwise.strategies;

import com.scaler.splitwise.models.Expense;
import com.scaler.splitwise.models.SettleUpTransaction;
import com.scaler.splitwise.models.User;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class GreedySettlementStrategy implements SettlementStrategy {

    @Override
    public List<SettleUpTransaction> settleExpenses(List<Expense> expenses) {

        // step 1 compute balances
        Map<Long, Double> balances = computeBalances(expenses);

        // step 1.5 create tree set
        TreeSet<Pair<Long, Double>> expenseTree = new TreeSet<>((left, right) -> (int)(left.getSecond() - right.getSecond()));
        for (Map.Entry<Long, Double> entry : balances.entrySet()) {
            expenseTree.add(Pair.of(entry.getKey(), entry.getValue()));
        }

        List<SettleUpTransaction> transactions = new ArrayList<>();

        // step 2 iterate over balances
        while (expenseTree.size() > 0) {

            // step 3 pick the max and min
            Pair<Long, Double> min = expenseTree.first();
            Pair<Long, Double> max = expenseTree.last();

            SettleUpTransaction transaction = SettleUpTransaction.builder()
                    .from(max.getFirst())
                    .to(min.getFirst())
                    .amount(max.getSecond())
                    .build();

            // step 4 remove existing balances and add new one
            expenseTree.remove(min);
            expenseTree.remove(max);

            expenseTree.add(Pair.of(min.getFirst(), min.getSecond() + max.getSecond()));
            transactions.add(transaction);
        }
            return transactions;
    }

    private Map<Long, Double> computeBalances(List<Expense> expenses) {
        Map<Long, Double> balances = new HashMap<>();
        for (Expense expense : expenses) {
            // in the expenses what is the owed by
            // Iterate over expenses
            // In the expenses what is owed by and paid by
            // update the balance
            for (User user : expense.getOwedBy().keySet()) {
                if(!balances.containsKey(user)) {
                    balances.put(user.getId(),0.0);
                }

                balances.put(user.getId(),
                        expense.getOwedBy().get(user) + balances.get(user.getId()));
            }

            for (User user : expense.getPaidBy().keySet()) {
                if(!balances.containsKey(user.getId())) {
                    balances.put(user.getId(),0.0);
                }

                balances.put(user.getId(),
                        expense.getPaidBy().get(user) - balances.get(user.getId()));
            }
        }
        return balances;
    }
}
