package com.example.rockpaperscissors;

import org.springframework.lang.NonNull;

public class Player {

    private final PlayerStrategy strategy;

    public Player(PlayerStrategy strategy) {
        this.strategy = strategy;
    }

    @NonNull
    public GameResult playAgainst(Player other) {
        HandSign handSign = play();
        return handSign.playAgainst(other.play());
    }

    @NonNull
    private HandSign play() {
        return strategy.playHandSign();
    }
}
