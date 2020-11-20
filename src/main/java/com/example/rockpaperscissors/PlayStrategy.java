package com.example.rockpaperscissors;

import org.springframework.lang.NonNull;

public interface PlayStrategy {
    @NonNull
    Shape playShape();
}
