package com.example.rockpaperscissors

import spock.lang.Specification

class HandSignStrategyTest extends Specification {

    def "shape strategy returns the same shape"() {
        given:
        def shape = HandSign.Rock
        def shapeStrategy = new HandSignStrategy(shape)

        when:
        def playedShape = shapeStrategy.playHandSign()

        then:
        shape == playedShape
    }
}
