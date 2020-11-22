package com.example.rockpaperscissors;

public enum GameResult {
    Win("Wins"), Draw("Draws"), Loose("Losses");

    private final String plural;

    GameResult(String plural) {
        this.plural = plural;
    }

    public String plural() {
        return plural;
    }
}
