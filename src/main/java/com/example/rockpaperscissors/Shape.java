package com.example.rockpaperscissors;

import org.springframework.lang.NonNull;

import static com.example.rockpaperscissors.GameResult.Draw;

public enum Shape  {

    Paper {
        @Override
        GameResult playAgainstPaper() {
            return Draw;
        }
    }, Rock {
        @Override
        GameResult playAgainstPaper() {
            return null;
        }
    }, Scissor {
        @Override
        GameResult playAgainstPaper() {
            return null;
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

    private GameResult playAgainstScissor() {
        return null;
    }

    abstract GameResult playAgainstPaper();

    private GameResult playAgainstRock() {
        return null;
    }

}
