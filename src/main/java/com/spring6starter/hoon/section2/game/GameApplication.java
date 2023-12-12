package com.spring6starter.hoon.section2.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GameApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GameConfiguration.class)) {
            GameRunner gameRunner = context.getBean(GameRunner.class);
            gameRunner.run();
        }

    }
}
