package com.scaler.lld.design.v2.tictactoe.models;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Bot extends Player{

    private BotLevel botLevel;
    @Override
    public Move makeMove(Board board) {
        // check availability

        return null;
    }
}
