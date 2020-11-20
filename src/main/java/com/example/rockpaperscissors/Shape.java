package com.example.rockpaperscissors;

import org.springframework.lang.NonNull;

import static com.example.rockpaperscissors.GameResult.*;

public enum Shape {

    Paper {
        @Override
        GameResult playAgainstScissor() {
            return Loose;
        }

        @Override
        GameResult playAgainstPaper() {
            return Draw;
        }

        @Override
        GameResult playAgainstRock() {
            return Win;
        }
    },

    Rock {
        @Override
        GameResult playAgainstScissor() {
            return Draw;
        }

        @Override
        GameResult playAgainstPaper() {
            return Draw;
        }

        @Override
        GameResult playAgainstRock() {
            return Draw;
        }
    },

    Scissor {
        @Override
        GameResult playAgainstScissor() {
            return Draw;
        }

        @Override
        GameResult playAgainstPaper() {
            return Draw;
        }

        @Override
        GameResult playAgainstRock() {
            return Draw;
        }
    };

    @NonNull
    public GameResult playAgainst(@NonNull Shape other) {
        return switch (other) {
            case Paper -> playAgainstPaper();
            case Rock -> playAgainstRock();
            case Scissor -> playAgainstScissor();
        };
    }

    @NonNull
    abstract GameResult playAgainstScissor();

    @NonNull
    abstract GameResult playAgainstPaper();

    @NonNull
    abstract GameResult playAgainstRock();

}
