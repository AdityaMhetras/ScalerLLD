package com.scaler.lld.design.tictactoe.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Getter
public class Board {
    private List<List<Cell>> cells = new ArrayList<>();

    public Board(int rowCount, int columnCount) {
        IntStream.range(0, rowCount).forEach(row -> {
            List<Cell> rowCells = new ArrayList<>();
            IntStream.range(0, columnCount).forEach(column -> rowCells.add(new Cell(row, column)));
            cells.add(rowCells);
        });
    }

    public boolean isEmpty(int row, int column) {
        return cells.get(row).get(column).getSymbol() == null;
    }

    public List<Cell> getAvailableCells() {
        return cells.stream()
                .flatMap(List::stream)
                .filter(cell -> cell.getSymbol() == null)
                .toList();
    }
}
