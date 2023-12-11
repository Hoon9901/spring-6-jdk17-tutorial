package com.spring6starter.hoon.section2.game;

public class MarioGame implements ConsoleGame{

    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Go to hole");
    }

    @Override
    public void left() {
        System.out.println("Go Back");
    }

    @Override
    public void right() {
        System.out.println("Run");
    }
}
