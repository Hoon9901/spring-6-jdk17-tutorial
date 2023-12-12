package com.spring6starter.hoon.section2.iteration2;

public class KartGame implements ConsoleGame {
    @Override
    public void up() {
        System.out.println("전진");
    }

    @Override
    public void down() {
        System.out.println("후진");
    }

    @Override
    public void left() {
        System.out.println("좌회전");
    }

    @Override
    public void right() {
        System.out.println("우회전");
    }
}
