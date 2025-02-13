package com.patternStruct.adapter.classAdapter;

public class App {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.readSD(new SDAdapterTF());
    }
}
