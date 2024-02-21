package com.spring6starter.hoon.section2.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    private ConsoleGame game;

    public GameRunner(ConsoleGame game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game : " + game.toString());
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
