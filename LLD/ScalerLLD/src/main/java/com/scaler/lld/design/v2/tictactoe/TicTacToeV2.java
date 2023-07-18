package com.scaler.lld.design.v2.tictactoe;

import com.scaler.lld.design.v2.tictactoe.models.*;

public class TicTacToeV2 {

    public static void main(String[] args) {
        Game g = register();
    }
    public static Game register(){
        Player human = HumanPlayer.builder()
                .symbol(Symbol.O)
                .user(new User("aditya", "abc", null))
                .build();

        Player bot = Bot.builder()
                .symbol(Symbol.X)
                .botLevel(BotLevel.EASY)
                .build();

        return Game.builder()
                .ofBoardSize(3,3)
                .ofPlayer(human)
                .ofPlayer(bot)
                .build();
    }
}
