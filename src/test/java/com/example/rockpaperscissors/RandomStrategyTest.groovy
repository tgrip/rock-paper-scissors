package com.example.rockpaperscissors

import spock.lang.Specification

class RandomStrategyTest extends Specification {

    def "play random sign"() {
        given: "a mocked random"
        Random random = Mock()
        random.nextInt(3) >> 1

        and: "random strategy with this random"
        def randomStrategy = new RandomStrategy(random)

        when:
        def result = randomStrategy.playHandSign()

        then: "we get the second hand sign"
        HandSign.Rock == result
    }
}
