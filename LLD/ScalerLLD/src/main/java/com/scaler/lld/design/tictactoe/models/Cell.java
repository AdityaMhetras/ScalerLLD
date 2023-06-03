package com.scaler.lld.design.tictactoe.models;

import lombok.Getter;

@Getter
public class Cell {
    private Integer row;
    private Integer column;
    private Symbol symbol;

    public Cell(Integer row, Integer column) {
        this.row = row;
        this.column = column;
    }
}
