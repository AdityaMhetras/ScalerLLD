package com.scaler.lld.design.tictactoe.models;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public abstract class Player {
    private Symbol symbol;

    public abstract Move makeMove(Board board);
}
