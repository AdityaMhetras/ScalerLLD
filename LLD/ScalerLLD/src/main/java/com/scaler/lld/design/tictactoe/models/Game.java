package com.scaler.lld.design.tictactoe.models;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Game {
    private Board board;
    private List<Player> players = new ArrayList<>();

    // Step 1 for builder
    //create static inner class
    public static class Builder {
        // Step 2 add reference to outer class
        private Game game;

        public Builder(Game game) {
            this.game = new Game();
        }

        public Builder withDimensions(int row, int column) {
            Board board = new Board(row, column);
            game.board = board;
            return this;
        }

        public Game build() {
            boolean isValid = validate();
            if(!isValid) {
                throw new RuntimeException("Game is not valid");
            }
            return game;
        }

        private boolean validate() {
            return game.players.size() >= 2;
        }
    }

}
