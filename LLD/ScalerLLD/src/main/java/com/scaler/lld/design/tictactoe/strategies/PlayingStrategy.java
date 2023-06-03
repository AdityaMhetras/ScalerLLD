package com.scaler.lld.design.tictactoe.strategies;

import com.scaler.lld.design.tictactoe.models.Board;
import com.scaler.lld.design.tictactoe.models.Move;

public interface PlayingStrategy {

    Move makeMove(Board board);
}
