package com.scaler.lld.design.tictactoe.strategies;

import com.scaler.lld.design.tictactoe.models.Board;
import com.scaler.lld.design.tictactoe.models.Cell;
import com.scaler.lld.design.tictactoe.models.Move;

import java.util.List;

public class RandomPlayingStrategy implements PlayingStrategy{
    @Override
    public Move makeMove(Board board) {
        //find the available cells
        List<Cell> availableCells = board.getAvailableCells();

        //Generate a random number with size of available cells
        int randomIndex = (int) (Math.random() * availableCells.size());

        Cell randomCell = availableCells.get(randomIndex);
        System.out.println("bot Move "+(randomCell.getRow()+1)+", "+(randomCell.getColumn()+1));//making 1 based indexing for UI
        return new Move(randomCell.getRow(), randomCell.getColumn());
    }
}
