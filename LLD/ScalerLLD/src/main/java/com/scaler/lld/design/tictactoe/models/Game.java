package com.scaler.lld.design.tictactoe.models;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Game {
    private Board board;
    private List<Player> players = new ArrayList<>();

    // create static initializer
    public static Builder builder() {
        return new Builder();
    }

    // Step 1 for builder
    //create static inner class
    public static class Builder {
        // Step 2 add reference to outer class
        private Game game;

        public Builder() {
            this.game = new Game();
        }

        //create fluent interfaces/ setters
        public Builder withDimensions(int row, int column) {
            Board board = new Board(row, column);
            game.board = board;
            return this;
        }

        public Builder withPlayer(Player player) {
            game.players.add(player);
            return this;
        }

        // create build hook
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
