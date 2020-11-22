package com.example.rockpaperscissors;

import org.springframework.lang.NonNull;

import static com.example.rockpaperscissors.GameResult.*;

public enum HandSign {

    Paper {
        @Override
        GameResult playAgainstScissor() {
            return Lose;
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
            return Win;
        }

        @Override
        GameResult playAgainstPaper() {
            return Lose;
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
            return Win;
        }

        @Override
        GameResult playAgainstRock() {
            return Lose;
        }
    };

    @NonNull
    public GameResult playAgainst(@NonNull HandSign other) {
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
