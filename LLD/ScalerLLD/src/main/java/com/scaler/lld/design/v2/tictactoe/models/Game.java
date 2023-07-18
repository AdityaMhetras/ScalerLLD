package com.scaler.lld.design.v2.tictactoe.models;

import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;

    private Game() {}

    public static GameBuilder builder() {
        return new GameBuilder();
    }

    public static class GameBuilder{

        private Game game;

        public GameBuilder() {
            game = new Game();
        }

        public GameBuilder ofBoardSize(int row, int col) {
            game.board = new Board(row, col);
            return this;
        }

        public GameBuilder ofPlayer(Player player) {
            game.players.add(player);
            return this;
        }

        public boolean validate() {
            return game.players.size() == 2;
        }

        public Game build() {
            if(!validate()){
                throw new RuntimeException("number of players must be 2");
            }
            return game;
        }

    }

    public void makeMove() {

    }

    public void checkWinner() {

    }
}
