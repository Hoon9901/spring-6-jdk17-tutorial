package com.spring6starter.hoon.section2.game;

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
