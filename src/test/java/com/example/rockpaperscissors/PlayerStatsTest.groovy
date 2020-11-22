package com.example.rockpaperscissors

import spock.lang.Specification

import static com.example.rockpaperscissors.GameResult.Loose
import static com.example.rockpaperscissors.GameResult.Win

class PlayerStatsTest extends Specification {

    def playerStats = new PlayerStats()

    def "player starts with 0 wins, draws and loses"() {
        when:
        def status = playerStats.status()

        then:
        status == "0 Wins, 0 Draws, 0 Losses"
    }

    def "player shows first win"() {
        given:
        playerStats.addResult(Win)

        when:
        def status = playerStats.status()

        then:
        status == "1 Wins, 0 Draws, 0 Losses"
    }

    def "player stats shows correct stats"() {
        given:
        playerStats.addResult(Win)
        playerStats.addResult(Win)
        playerStats.addResult(Loose)

        when:
        def status = playerStats.status()

        then:
        status == "2 Wins, 0 Draws, 1 Losses"
    }
}
