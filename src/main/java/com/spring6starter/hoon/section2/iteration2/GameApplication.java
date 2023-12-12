package com.spring6starter.hoon.section2.iteration2;

public class GameApplication {

    public static void main(String[] args) {
//        var game = new MarioGame();
        // var game = new SuperContraGame();
        var game = new KartGame();
        var gameRunner = new GameRunner(game); // Game Runner 클래스가 특정 게임과 강하게 결합
        gameRunner.run();
    }
}
