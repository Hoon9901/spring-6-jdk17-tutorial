package com.spring6starter.hoon.section2.game;

import java.util.DoubleSummaryStatistics;

public class KartGame implements ConsoleGame {

    @Override
    public void up() {
        System.out.println("전속력으로 주행");
    }

    @Override
    public void down() {
        System.out.println("속도 감소");
    }

    @Override
    public void left() {
        System.out.println("왼쪽으로 회전");
    }

    @Override
    public void right() {
        System.out.println("오른쪽으로 회전");
    }
}
