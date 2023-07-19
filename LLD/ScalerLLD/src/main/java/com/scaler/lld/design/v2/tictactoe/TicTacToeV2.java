package com.scaler.lld.design.v2.tictactoe;

import com.scaler.lld.design.v2.tictactoe.models.*;

public class TicTacToeV2 {

    public static void main(String[] args) {
        Game game = register();
        System.out.println("welcome to Aditya's tic tac toe");

        while (game.getStatus() == GameStatus.IN_PROGRESS) {
            Player nextPlayer = game.getNextPlayer();
            System.out.println("next move is of "+nextPlayer.getSymbol());

            game.makeMove();

            //check if player has won
            if(game.getStatus() == GameStatus.WON) {
                System.out.println("winner is "+game.getWinner().getSymbol());
                break;
            }
            //check if drawn
            if(game.getStatus() == GameStatus.DRAWN) {
                System.out.println("game drawn ");
                break;
            }
        }

    }
    public static Game register(){
        Player human = HumanPlayer.builder()
                .symbol(Symbol.O)
                .user(new User("aditya", "abc", null))
                .build();

        Player bot = Bot.builder()
                .symbol(Symbol.X)
                .botLevel(BotLevel.EASY)
                .botStrategy(new RandomMoveStrategy())
                .build();

        return Game.builder()
                .ofBoardSize(3,3)
                .ofPlayer(human)
                .ofPlayer(bot)
                .build();
    }
}
