package com.spring6starter.hoon.section2;

import com.spring6starter.hoon.section2.game.ConsoleGame;
import com.spring6starter.hoon.section2.game.GameRunner;
import com.spring6starter.hoon.section2.game.KartGame;
import com.spring6starter.hoon.section2.game.MarioGame;
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
    @Primary
    public GameRunner gameRunner(ConsoleGame consoleGame) {
        return new GameRunner(consoleGame);
    }

    @Bean
    public GameRunner gameRunner2(@Qualifier("marioGame") ConsoleGame consoleGame) {
        return new GameRunner(consoleGame);
    }

}
