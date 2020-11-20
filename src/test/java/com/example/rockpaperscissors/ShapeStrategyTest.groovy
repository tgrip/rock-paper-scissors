package com.example.rockpaperscissors

import spock.lang.Specification

class ShapeStrategyTest extends Specification {

    def "shape strategy returns the same shape"() {
        given:
        def shape = Shape.Rock
        def shapeStrategy = new ShapeStrategy(shape)

        when:
        def playedShape = shapeStrategy.playShape()

        then:
        shape == playedShape
    }
}
