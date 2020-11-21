package com.example.rockpaperscissors;

public class HandSignStrategy implements PlayStrategy {

    private final HandSign handSign;

    public HandSignStrategy(HandSign handSign) {
        this.handSign = handSign;
    }

    @Override
    public HandSign playHandSign() {
        return handSign;
    }
}
