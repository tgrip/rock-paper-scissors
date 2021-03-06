package com.example.rockpaperscissors.conf;

import com.example.rockpaperscissors.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class RockPaperScissorConfiguration {

    @Bean
    public RockPaperScissorGame game() {
        return new RockPaperScissorGame(player1(), player2(), 100);
    }

    private Player player1() {
        Random random = new Random();
        PlayerStrategy randomStrategy = new RandomStrategy(random);
        return new Player(randomStrategy);
    }

    private Player player2() {
        PlayerStrategy sameMoveStrategy = new HandSignStrategy(HandSign.Rock);
        return new Player(sameMoveStrategy);
    }

}
