package com.example.rockpaperscissors

import spock.lang.Specification

import static com.example.rockpaperscissors.Shape.Paper
import static com.example.rockpaperscissors.Shape.Rock
import static com.example.rockpaperscissors.Shape.Scissor

class ShapeTest extends Specification {

    def "play with paper"() {
        when:
        def shape = Paper

        then:
        shape.playAgainst(Paper) == GameResult.Draw
    }
}
