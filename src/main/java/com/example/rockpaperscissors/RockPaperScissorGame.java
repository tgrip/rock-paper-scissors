package com.example.rockpaperscissors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class RockPaperScissorGame {

    private final static Log log = LogFactory.getLog(RockPaperScissorGame.class);

    private final Player player1;
    private final Player player2;
    private final int nrRounds;

    public RockPaperScissorGame(Player player1, Player player2, int nrRounds) {
        this.player1 = player1;
        this.player2 = player2;
        this.nrRounds = nrRounds;
    }

    public void playGame() {
        log.info("Starting game");
        GameStats gameStats = new GameStats();
        for (int i = 0; i < nrRounds; i++) {
            playRound(gameStats);
        }
        printResult(gameStats);
    }

    private void printResult(GameStats gameStats) {
        log.info("Game finished");
        log.info(String.format("Results after playing %d rounds", nrRounds));
        log.info("Player 1");
        log.info(gameStats.status(player1));
        log.info("Player 2");
        log.info(gameStats.status(player2));
    }

    private void playRound(GameStats gameStats) {
        GameResult resultPlayerOne = player1.playAgainst(player2);
        gameStats.addResult(player1, resultPlayerOne);
        gameStats.addResult(player2, resultPlayerOne.complement());
    }
}
