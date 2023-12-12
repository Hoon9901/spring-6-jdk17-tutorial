package com.spring6starter.hoon.section2.iteration1;

public class GameApplication {

    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
