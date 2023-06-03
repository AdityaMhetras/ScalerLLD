package com.scaler.lld.design.tictactoe.models;

import com.scaler.lld.design.tictactoe.exceptions.InvalidMoveException;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Game {
    private Board board;
    private List<Player> players = new ArrayList<>();
    private int nextPlayerIndex = 0;
    private GameStatus status;
    private Player winner;
    public void makeMove() throws InvalidMoveException {
        //get the next player
        Player player = getNextPlayer();
        Move move = player.makeMove(board);

        if(!board.isEmpty(move.getRow(),move.getColumn())) {
            throw new InvalidMoveException("Cell is not empty");
        }

        // update the board
        board.getCells().get(move.getRow()).get(move.getColumn()).setSymbol(player.getSymbol());

        //check winner
        if (checkWinner (player.getSymbol())) {
            //implement using strategy design pattern to abstract away different winning conditions, row, column, diagonal
            //think about how you use them together
            status = GameStatus.WON;
            winner = player;
            return;
        }

        //check draw
        if (checkDraw (player.getSymbol())) {
            status = GameStatus.DRAWN;
            return;
        }

        //incremented the next player index
        nextPlayerIndex = (nextPlayerIndex + 1) % players.size();
    }

    private boolean checkDraw(Symbol symbol) {
        return false;
    }

    private boolean checkWinner(Symbol symbol) {
        return false;
    }

    public Player getNextPlayer() {
        return players.get(nextPlayerIndex);
    }

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
            this.game.status = GameStatus.IN_PROGRESS;
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
