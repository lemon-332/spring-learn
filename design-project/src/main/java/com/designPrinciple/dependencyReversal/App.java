package com.designPrinciple.dependencyReversal;

public class App {
    public static void main(String[] args) {
        Computer computer = new Computer();
        ACpu aCpu = new ACpu();
        ADisk aDisk = new ADisk();
        AMemory aMemory = new AMemory();
        computer.setCpu(aCpu);
        computer.setDisk(aDisk);
        computer.setMemory(aMemory);
        computer.run();
    }
}
