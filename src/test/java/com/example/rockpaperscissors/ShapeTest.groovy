package com.example.rockpaperscissors

import spock.lang.Specification

import static com.example.rockpaperscissors.Shape.Paper
import static com.example.rockpaperscissors.Shape.Paper
import static com.example.rockpaperscissors.Shape.Rock
import static com.example.rockpaperscissors.Shape.Scissor

class ShapeTest extends Specification {

    def "play with paper"() {
        given:
        def shape = Paper

        when:
        def gameResult = shape.playAgainst(otherShape)

        then:
        gameResult == expectedResult

        where:
        otherShape  | expectedResult
        Paper       | GameResult.Draw
    }
}
