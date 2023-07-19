package com.scaler.lld.design.v2.tictactoe.models;

import com.scaler.lld.design.v2.tictactoe.models.interfaces.BotStrategy;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Bot extends Player {

    private BotLevel botLevel;

    private BotStrategy botStrategy;

    @Override
    public Move makeMove(Board board) {
        // check availability

        return botStrategy.makeMove(board);
    }
}
