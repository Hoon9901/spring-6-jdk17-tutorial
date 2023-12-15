package com.spring6starter.hoon.section2.iteration3;

public class GameRunner {

    private ConsoleGame game;

    public GameRunner(ConsoleGame game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
