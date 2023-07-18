package com.scaler.lld.design.v2.tictactoe.models;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public abstract class Player {

    private Symbol symbol;

    public abstract Move makeMove(Board board);
}
