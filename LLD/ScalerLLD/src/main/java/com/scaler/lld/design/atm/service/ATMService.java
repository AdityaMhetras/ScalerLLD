package com.scaler.lld.design.atm.service;

import com.example.atm.exceptions.InsufficientFundsException;
import com.example.atm.exceptions.NotEnoughBalanceException;
import com.example.atm.models.*;
import com.example.atm.repository.ATMRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ATMService {

    private UserService userService;

    private ATMRepository atmRepository;

    public boolean withDraw(String userId, int pin, Double amount, String atmId) {

        Transaction transaction = new Transaction( atmId,  TransactionType.WITHDRAW, userId, amount);

        ATM atm = atmRepository.getAtm(atmId);

        if(atm.getBalance() < amount) {
            throw new InsufficientFundsException("Insufficient funds in ATM at the moment");
        }

        NotesComposition customerNotesComp =  atm.getComposition().getCustomerNotesComposition( amount);

        if(customerNotesComp != null) {
            transaction.setStatus(TransactionStatus.SUCCESSFUL);
            atm.getTransactions().add(transaction);
            return true;
        }
        transaction.setStatus(TransactionStatus.FAILED);
        atm.getTransactions().add(transaction);

        return false;
    }

}
