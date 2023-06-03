package com.scaler.lld.design.tictactoe.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cell {
    private Integer row;
    private Integer column;
    private Symbol symbol;

    public Cell(Integer row, Integer column) {
        this.row = row;
        this.column = column;
    }
}
