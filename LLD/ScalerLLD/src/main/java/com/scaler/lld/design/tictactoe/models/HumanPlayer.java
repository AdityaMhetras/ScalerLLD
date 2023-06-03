package com.scaler.lld.design.tictactoe.models;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Scanner;

@Getter
@SuperBuilder
public class HumanPlayer extends Player{

    private User user;

    @Builder.Default // to initialize in a builder
    private Scanner scanner = new Scanner(System.in);

    @Override
    public Move makeMove(Board board) {
        System.out.println("Enter the next row and column");

        int row = scanner.nextInt()-1;//0 based index
        int column = scanner.nextInt()-1;

        return new Move(row, column);

    }


}
