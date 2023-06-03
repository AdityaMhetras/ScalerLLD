package com.scaler.lld.design.tictactoe.models;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class BoardTest {

    @Test
    public void testDimensions() {
        Board board = new Board(3,3);
        List<List<Cell>> cells = board.getCells();

        Assert.assertEquals("If board is created, number of rows should be 3",3,cells.size());
        Assert.assertEquals("If board is created, number of columns should be 3",3,cells.get(0).size());

    }
}
