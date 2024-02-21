package com.spring6starter.hoon.section2;

import com.spring6starter.hoon.section2.game.GameRunner;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.spring6starter.hoon.section2.game")
public class GameApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GameApplication.class)) {
            GameRunner gameRunner = context.getBean(GameRunner.class);
            gameRunner.run();
        }
    }
}
