package com.scaler.lld.design.tictactoe.models;

import com.scaler.lld.design.tictactoe.strategies.PlayingStrategy;
import lombok.Getter;

@Getter
public class Bot extends Player{

    private BotLevel botLevel;
    private PlayingStrategy strategy;

    @Override
    public Move makeMove(Board board) {
        return strategy.makeMove(board);
    }
}