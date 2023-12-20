package com.spring6starter.hoon.section2;

import com.spring6starter.hoon.section2.game.ConsoleGame;
import com.spring6starter.hoon.section2.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.Console;

public class GameApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GameConfiguration.class)) {
            GameRunner gameRunner = context.getBean(GameRunner.class);
            gameRunner.run();

            context.getBean(ConsoleGame.class).up();

            context.getBean("gameRunner2", GameRunner.class).run();

        }
    }
}
