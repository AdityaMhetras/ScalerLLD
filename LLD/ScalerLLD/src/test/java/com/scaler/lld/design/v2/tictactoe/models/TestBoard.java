package com.scaler.lld.design.v2.tictactoe.models;

import org.junit.Assert;
import org.junit.Test;

public class TestBoard {

    @Test
    public void testBoardConstructor() {
        Board board = new Board(3,3);

        Assert.assertEquals("row 2 col 3, row is 2", 1, board.getCells().get(1).get(2).getRow());
        Assert.assertEquals("row 2 col 3, row is 2", 2, board.getCells().get(1).get(2).getCol());

    }
}
