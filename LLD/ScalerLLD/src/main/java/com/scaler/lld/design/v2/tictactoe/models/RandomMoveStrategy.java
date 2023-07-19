package com.scaler.lld.design.v2.tictactoe.models;

import com.scaler.lld.design.v2.tictactoe.models.interfaces.BotStrategy;

import java.util.List;

public class RandomMoveStrategy implements BotStrategy {
    @Override
    public Move makeMove(Board board) {
        List<Cell> availableCells = board.getAvailableCells();

        // define the range
        int min = 0;
        int max = availableCells.size();
        int range = max - min + 1;

        // get random index
        int index = (int) (Math.random() * range) + min;

        int row = availableCells.get(index).getRow();
        int col = availableCells.get(index).getCol();
        return new Move(row,col);
    }

    // driver code
/*    public static void main(String args[])
    {
        // define the range
        int max = 10;
        int min = 1;
        int range = max - min + 1;

        // generate random numbers within 1 to 10
        for (int i = 0; i < 10; i++) {
            int rand = (int)(Math.random() * range) + min;

            // Output is different everytime this code is executed
            System.out.println(rand);
        }
    }*/
}
