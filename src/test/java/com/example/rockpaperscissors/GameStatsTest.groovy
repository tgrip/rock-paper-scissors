package com.example.rockpaperscissors

import spock.lang.Specification

class GameStatsTest extends Specification {

    def gameStats = new GameStats()
    def player = new Player(Mock(PlayerStrategy))

    def "game stats displays stats for user"() {
        given:
        gameStats.addResult(player, GameResult.Draw)

        when:
        def status = gameStats.status(player)

        then:
        status == "Player (0 Wins, 1 Draws, 0 Losses)"
    }

    def "display player unknown"() {
        when:
        def status = gameStats.status(player)

        then:
        status == "Unknown player"
    }
}
