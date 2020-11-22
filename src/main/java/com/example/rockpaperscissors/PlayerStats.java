package com.example.rockpaperscissors;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PlayerStats {

    private final Map<GameResult, Integer> stats;

    public PlayerStats() {
        stats = new HashMap<>();
    }

    public String status() {
        return EnumSet.allOf(GameResult.class).stream()
                .map(this::getResultStat)
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }

    private ResultStat getResultStat(GameResult gameResult) {
        int count = stats.getOrDefault(gameResult, 0);
        return new ResultStat(gameResult, count);
    }

    private static class ResultStat {

        private final GameResult gameResult;
        private final int count;

        ResultStat(GameResult gameResult, int count) {
            this.gameResult = gameResult;
            this.count = count;
        }

        @Override
        public String toString() {
            return count + " " + gameResult.plural();
        }
    }
}
