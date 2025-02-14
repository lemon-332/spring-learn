package com.designPrinciple.patternBehaviour.celue;

public class App {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.salesManShow();
        new SalesMan(new StrategyB()).salesManShow();
    }
}
