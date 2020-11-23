package com.example.rockpaperscissors

import spock.lang.Specification
import spock.lang.Unroll

import static com.example.rockpaperscissors.GameResult.Draw
import static com.example.rockpaperscissors.GameResult.Lose
import static com.example.rockpaperscissors.GameResult.Win

class GameResultTest extends Specification {

    @Unroll
    def "the complement of #gameResult is #expectedComplement"() {
        when:
        def complement = gameResult.complement()

        then:
        expectedComplement == complement

        where:
        gameResult  | expectedComplement
        Win         | Lose
        Lose        | Win
        Draw        | Draw
    }
}
