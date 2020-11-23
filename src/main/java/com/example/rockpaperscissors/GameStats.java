package com.example.rockpaperscissors;

import java.util.HashMap;
import java.util.Map;

public class GameStats {

    private final Map<Player, PlayerStats> statsMap;

    public GameStats() {
        statsMap = new HashMap<>();
    }

    public void addResult(Player player, GameResult gameResult) {
        PlayerStats playerStats = statsMap.computeIfAbsent(player, k -> new PlayerStats());
        playerStats.addResult(gameResult);
    }

    public String status(Player player) {
        PlayerStats stats = statsMap.get(player);
        if (stats == null) {
            return "Unknown player";
        } else {
            return "(" + stats.status() + ")";
        }
    }
}
