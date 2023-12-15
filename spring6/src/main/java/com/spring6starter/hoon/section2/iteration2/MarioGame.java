package com.spring6starter.hoon.section2.iteration2;

public class MarioGame implements ConsoleGame {

    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Go to hole");
    }

    public void left() {
        System.out.println("Go Back");
    }

    public void right() {
        System.out.println("Run");
    }

}
