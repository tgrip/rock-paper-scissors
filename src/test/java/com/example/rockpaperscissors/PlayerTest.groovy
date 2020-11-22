package com.example.rockpaperscissors

import spock.lang.Specification

class PlayerTest extends Specification {

    def "Player who play with the same strategy draw"() {
        given:
        def player1 = createPlayer(HandSign.Rock)
        def player2 = createPlayer(HandSign.Rock)

        when:
        def result = player1.playAgainst(player2)

        then:
        result == GameResult.Draw
    }

    private Player createPlayer(HandSign signPlayed) {
        PlayerStrategy strategy = Mock()
        strategy.playHandSign() >> signPlayed
        new Player(strategy)
    }

    def "player with winning hand sign wins"() {
        given:
        def player1 = createPlayer(HandSign.Paper)
        def player2 = createPlayer(HandSign.Rock)

        when:
        def result = player1.playAgainst(player2)

        then:
        result == GameResult.Win
    }
}
