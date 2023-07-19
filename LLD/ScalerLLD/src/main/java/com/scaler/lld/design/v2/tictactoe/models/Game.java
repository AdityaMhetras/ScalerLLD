package com.scaler.lld.design.v2.tictactoe.models;

import lombok.Getter;

import java.util.List;

@Getter
public class Game {
    private Board board;
    private List<Player> players;
    private Player winner;

    private GameStatus status;
    private int nextPlayerIndex = 0;

    private Game() {}

    public static GameBuilder builder() {
        return new GameBuilder();
    }

    public static class GameBuilder{

        private Game game;

        public GameBuilder() {
            game = new Game();
            game.status = GameStatus.IN_PROGRESS;
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

    public Player getNextPlayer() {
        return players.get(nextPlayerIndex);
    }

    public void makeMove() {
        Player player = getNextPlayer();

        Move move = player.makeMove(board);

        if(!board.isCellAvailable(move)) {
            throw new RuntimeException("cell not available");
        }

        //update cells
        board.getCells()
                .get(move.getRow())
                .get(move.getCol())
                .setSymbol(player.getSymbol());

        if(checkDrawn()){
            status = GameStatus.DRAWN;
        }

        if(checkForWinner()){
            winner = players.get(0);
            status = GameStatus.WON;
        }

        nextPlayerIndex = (nextPlayerIndex+1) % players.size();

    }

    public boolean checkDrawn() {
        return false;
    }

    public boolean checkForWinner() {
        return true;
    }
}
