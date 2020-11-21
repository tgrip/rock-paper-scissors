package com.example.rockpaperscissors;

import java.util.EnumSet;
import java.util.Random;

public class RandomStrategy implements PlayStrategy {

    private final Random random;
    private final EnumSet<HandSign> handSigns;
    private final int nrHandSigns;

    public RandomStrategy(Random random) {
        this.random = random;
        handSigns = EnumSet.allOf(HandSign.class);
        nrHandSigns = handSigns.size();
    }

    @Override
    public HandSign playHandSign() {
        int skips = random.nextInt(nrHandSigns);
        return handSigns.stream().skip(skips)
                .findFirst().orElseThrow();
    }
}
