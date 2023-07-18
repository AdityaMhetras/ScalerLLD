package com.scaler.lld.design.v2.tictactoe.models;

import lombok.Getter;

@Getter
public class Cell {
    private int row;
    private int col;
    private Symbol symbol;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
