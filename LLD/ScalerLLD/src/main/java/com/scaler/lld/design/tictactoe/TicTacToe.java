package com.scaler.lld.design.tictactoe;

import com.scaler.lld.design.tictactoe.models.*;

public class TicTacToe {
    public static void main(String[] args) {
        // Create the game object
        Game game = createGame();

    }

    private static Game createGame() {
//we should not use sub classes, use factory pattern, assignment
        Player human = HumanPlayer.builder()
                .symbol(Symbol.O)
                .user(new User("Aditya Mhetras", "a.b@g.com", null))
                .build();

        Player bot = Bot.builder()
                .symbol(Symbol.X)
                .botLevel(BotLevel.EASY)
                .build();

        return Game.builder()
                .withDimensions(3,3)
                .withPlayer(human)
                .withPlayer(bot)
                .build();
    }
}
