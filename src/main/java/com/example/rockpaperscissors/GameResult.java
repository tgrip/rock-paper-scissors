package com.example.rockpaperscissors;

import org.springframework.lang.NonNull;

public enum GameResult {
    Win("Wins") {
        @Override
        public GameResult complement() {
            return Lose;
        }
    },
    Draw("Draws") {
        @Override
        public GameResult complement() {
            return Draw;
        }
    },
    Lose("Losses") {
        @Override
        public GameResult complement() {
            return Win;
        }
    };

    private final String plural;

    GameResult(String plural) {
        this.plural = plural;
    }

    public String plural() {
        return plural;
    }

    @NonNull
    public abstract GameResult complement();
}
