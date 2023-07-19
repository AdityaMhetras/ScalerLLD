package com.scaler.lld.design.v2.tictactoe.models;

import lombok.Builder;
import lombok.experimental.SuperBuilder;

import java.util.Scanner;

@SuperBuilder
public class HumanPlayer extends Player{

    private User user;

    @Builder.Default // to initialize in a builder
    private Scanner scanner = new Scanner(System.in);

    @Override
    public Move makeMove(Board board) {
        System.out.println("please enter x and y");

        int row = scanner.nextInt()-1; // 0 based indexing
        int col = scanner.nextInt()-1;

        return new Move(row, col);
    }
}
