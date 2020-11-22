package com.example.rockpaperscissors

import spock.lang.Specification

class PlayerStatsTest extends Specification {

    def playerStats = new PlayerStats()

    def "player starts with 0 wins, draws and loses"() {
        when:
        def status = playerStats.status()

        then:
        status == "0 Wins, 0 Draws, 0 Loses"
    }
}
