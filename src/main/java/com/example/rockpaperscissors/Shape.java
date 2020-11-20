package com.example.rockpaperscissors;

import org.springframework.lang.NonNull;

import static com.example.rockpaperscissors.GameResult.Draw;

public enum Shape {

    Paper {
        @Override
        GameResult playAgainstPaper() {
            return Draw;
        }
    },

    Rock {
        @Override
        GameResult playAgainstPaper() {
            return Draw;
        }
    },

    Scissor {
        @Override
        GameResult playAgainstPaper() {
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
    private GameResult playAgainstScissor() {
        return Draw;
    }

    @NonNull
    abstract GameResult playAgainstPaper();

    @NonNull
    private GameResult playAgainstRock() {
        return Draw;
    }

}
