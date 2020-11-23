package com.example.rockpaperscissors;

public class RockPaperScissorGame {

    private final Player player1;
    private final Player player2;
    private final int nrRounds;

    public RockPaperScissorGame(Player player1, Player player2, int nrRounds) {
        this.player1 = player1;
        this.player2 = player2;
        this.nrRounds = nrRounds;
    }

    public void playGame() {
        GameStats gameStats = new GameStats();
        for(int i = 0; i < nrRounds; i++) {
            playRound(gameStats);
        }
        printResult(gameStats);
    }

    private void printResult(GameStats gameStats) {
        System.out.println("Game finished");
        System.out.printf("Results after %d rounds %n", nrRounds);
        System.out.println("Player 1");
        System.out.println(gameStats.status(player1));
        System.out.println("Player 2");
        System.out.println(gameStats.status(player2));
    }

    private void playRound(GameStats gameStats) {
        GameResult resultPlayerOne = player1.playAgainst(player2);
        gameStats.addResult(player1, resultPlayerOne);
        gameStats.addResult(player2, resultPlayerOne.complement());
    }
}
