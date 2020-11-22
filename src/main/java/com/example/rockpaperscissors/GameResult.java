package com.example.rockpaperscissors;

public enum GameResult {
    Win("Wins"), Draw("Draws"), Loose("Loses");

    private final String plural;

    GameResult(String plural) {
        this.plural = plural;
    }

    public String plural() {
        return plural;
    }
}
