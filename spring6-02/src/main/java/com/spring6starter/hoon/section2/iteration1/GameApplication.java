package com.spring6starter.hoon.section2.iteration1;

public class GameApplication {

    public static void main(String[] args) {
//        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(superContraGame); // Game Runner 클래스가 특정 게임과 강하게 결합
        gameRunner.run();
    }
}
