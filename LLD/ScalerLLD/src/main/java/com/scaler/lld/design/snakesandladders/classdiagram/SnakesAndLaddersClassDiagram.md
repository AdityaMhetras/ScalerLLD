---
title: Snakes and Ladders class diagram
---
classDiagram

    Game "1" --* "1" Board
    Game "1" --* "M" Player
    Game "1" --* "*" Dice
    Game "1" --* "1" Leaderboard

    Board "1" --* "M" Cell

    Cell "1" --* "M" Piece
    Cell "1" --* "M" Obstacle

    Player "1" --* "M" Piece

    Leaderboard "1" --* "M" PlayerRanking

    Obstacle <|-- BaseCell
    Obstacle <|-- Snake
    Obstacle <|-- Ladder



    class Game{
        -Board board
        -Player[] players
        -Dice[] dices
        -GameStatus status
        -Leaderboard leaderboard

        +createGame(CreateGameRequest): Game
        +roll(): int
        +makeMove(player, piece)
        +getLeaderBoard()
    }

    class Board{
        -int size
        -Cell[] cells

    }

    class Cell{
        -int position
        -Obstacle obstacle
        -Piece[] pieces
    }

    class Dice{
        -int faceValue

        +roll():int
    }

    class Player{
        -int id
        -String name
        -Piece[] pieces

    }

    class Piece{
        -String color
    }


    class Leaderboard{
        -PlayerRanking[] ranking
    }

    class PlayerRanking{
        -int rank
        -Player player
    }

    class Obstacle{
        <<abstract>>
        -int start
        -int end

        +nextPosition(): int
    }

    class Snake{
        +nextPosition(): int
    }

    class Ladder{
        +nextPosition(): int
    }

    class BaseCell{
        +nextPosition(): int
    }