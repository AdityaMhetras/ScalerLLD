package com.scaler.lld.design.tictactoe;

import com.scaler.lld.design.tictactoe.exceptions.InvalidMoveException;
import com.scaler.lld.design.tictactoe.models.*;

public class TicTacToe {
    public static void main(String[] args) throws InvalidMoveException {
        // Create the game object
        Game game = createGame();
        System.out.println("welcome to Aditya's TicTacToe!");

        while (game.getStatus() == GameStatus.IN_PROGRESS) {
            Player nextPlayer = game.getNextPlayer();
            System.out.println("Next move is of player "+nextPlayer.getSymbol());
            game.makeMove();
        }

        if (game.getStatus().equals(GameStatus.DRAWN)) {
            System.out.println("Game Drawn");
        }

        if (game.getStatus().equals(GameStatus.WON)) {
            System.out.println("Game Won by "+game.getWinner().getSymbol());
        }
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
