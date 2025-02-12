package com.designPrinciple.dependencyReversal;

public class ACpu implements Cpu {

    @Override
    public void run() {
        System.out.println("A cpu running");
    }
}
