package com.scaler.lld.design.v2.tictactoe.models.interfaces;

import com.scaler.lld.design.v2.tictactoe.models.Board;
import com.scaler.lld.design.v2.tictactoe.models.Move;

public interface BotStrategy {

    Move makeMove(Board board);
}
