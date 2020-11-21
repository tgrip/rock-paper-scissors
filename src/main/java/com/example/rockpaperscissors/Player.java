package com.example.rockpaperscissors;

import org.springframework.lang.NonNull;

public class Player {

    private final PlayStrategy strategy;

    public Player(PlayStrategy strategy) {
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
