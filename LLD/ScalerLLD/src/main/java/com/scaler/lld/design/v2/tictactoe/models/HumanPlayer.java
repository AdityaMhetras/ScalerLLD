package com.scaler.lld.design.v2.tictactoe.models;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class HumanPlayer extends Player{

    private User user;

    @Override
    public Move makeMove(Board board) {
        return null;
    }
}
