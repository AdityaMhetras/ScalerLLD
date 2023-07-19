package com.scaler.lld.design.v2.tictactoe.models;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Getter
public class Board {
    private List<List<Cell>> cells = new ArrayList<>();

    public Board(int rowNum, int colNum){

        IntStream.range(0,rowNum).forEach(row -> {

            List<Cell> rowCells = new ArrayList<>();

            IntStream.range(0,colNum)
                    .forEach(col -> rowCells.add(new Cell(row, col)));

            cells.add(rowCells);
        });
    }

    public boolean isCellAvailable(Move move) {
        return cells
                .get(move.getRow())
                .get(move.getCol())
                .getSymbol() == null;
    }

    public List<Cell> getAvailableCells() {
        return cells.stream()
                .flatMap(List::stream)
                .filter(cell -> cell.getSymbol() == null)
                .toList();
    }
}
