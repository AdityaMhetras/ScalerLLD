package com.scaler.lld.design.tictactoe.models;

public abstract class Player {
    private Symbol symbol;

    public abstract Move makeMove(Board board);
}
