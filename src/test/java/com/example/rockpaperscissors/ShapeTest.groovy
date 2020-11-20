package com.example.rockpaperscissors

import spock.lang.Specification
import spock.lang.Unroll

import static com.example.rockpaperscissors.Shape.Paper
import static com.example.rockpaperscissors.Shape.Rock
import static com.example.rockpaperscissors.Shape.Scissor

class ShapeTest extends Specification {

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
        Paper       | GameResult.Draw
        Rock        | GameResult.Win
        Scissor     | GameResult.Loose
    }
}
