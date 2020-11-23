package com.example.rockpaperscissors;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class PlayerStats {

    private final Map<GameResult, Integer> stats;

    PlayerStats() {
        stats = new HashMap<>();
    }

    String status() {
        return EnumSet.allOf(GameResult.class).stream()
                .map(this::getResultStat)
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }

    private ResultStat getResultStat(GameResult gameResult) {
        int count = stats.getOrDefault(gameResult, 0);
        return new ResultStat(gameResult, count);
    }

    void addResult(GameResult gameResult) {
        stats.merge(gameResult, 1, Integer::sum);
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
