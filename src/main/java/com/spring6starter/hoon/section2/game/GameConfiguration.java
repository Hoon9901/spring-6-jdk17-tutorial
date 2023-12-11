package com.spring6starter.hoon.section2.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GameConfiguration {

    @Bean
    @Qualifier("marioGame")
    public ConsoleGame consoleGame1() {
        return new MarioGame();
    }

    @Bean
    @Primary
    public ConsoleGame consoleGame2() {
        return new KartGame();
    }

    @Bean
    public GameRunner gameRunner(ConsoleGame consoleGame) {
        return new GameRunner(consoleGame);
    }
}
