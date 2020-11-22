package com.example.rockpaperscissors;

import org.springframework.lang.NonNull;

public interface PlayerStrategy {
    @NonNull
    HandSign playHandSign();
}
