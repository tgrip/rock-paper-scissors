package com.example.rockpaperscissors

import spock.lang.Specification
import spock.lang.Unroll

import static com.example.rockpaperscissors.GameResult.Draw
import static com.example.rockpaperscissors.GameResult.Loose
import static com.example.rockpaperscissors.GameResult.Win
import static HandSign.Paper
import static HandSign.Rock
import static HandSign.Scissor

class HandSignTest extends Specification {

    @Unroll
    def "When playing with Paper against #otherShape, the result has to be #expectedResult"() {
        given:
        def shape = Paper

        when:
        def gameResult = shape.playAgainst(otherShape)

        then:
        gameResult == expectedResult

        where:
        otherShape  | expectedResult
        Paper       | Draw
        Rock        | Win
        Scissor     | Loose
    }

    @Unroll
    def "When playing with Scissor against #otherShape, the result has to be #expectedResult"() {
        given:
        def shape = Scissor

        when:
        def gameResult = shape.playAgainst(otherShape)

        then:
        gameResult == expectedResult

        where:
        otherShape  | expectedResult
        Paper       | Win
        Rock        | Loose
        Scissor     | Draw
    }

    @Unroll
    def "When playing with Rock against #otherShape, the result has to be #expectedResult"() {
        given:
        def shape = Rock

        when:
        def gameResult = shape.playAgainst(otherShape)

        then:
        gameResult == expectedResult

        where:
        otherShape  | expectedResult
        Paper       | Loose
        Rock        | Draw
        Scissor     | Win
    }
}
