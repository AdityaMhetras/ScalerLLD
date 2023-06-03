package com.scaler.lld.design.tictactoe.models;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class HumanPlayer extends Player{

    private User user;
    @Override
    public Move makeMove(Board board) {
        return null;
    }
}
