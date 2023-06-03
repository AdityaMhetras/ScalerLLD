package com.scaler.lld.design.tictactoe.models;

import com.scaler.lld.design.tictactoe.strategies.PlayingStrategy;
import com.scaler.lld.design.tictactoe.strategies.RandomPlayingStrategy;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class Bot extends Player{

    private BotLevel botLevel;

    @Builder.Default
    private PlayingStrategy strategy = new RandomPlayingStrategy();

    @Override
    public Move makeMove(Board board) {
        return strategy.makeMove(board);
    }
}
