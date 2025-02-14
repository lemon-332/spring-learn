package com.designPrinciple.patternBehaviour.celue;

public class StrategyA implements Strategy {
    @Override
    public void show() {
        System.out.println("策略A 买一送一");
    }
}
