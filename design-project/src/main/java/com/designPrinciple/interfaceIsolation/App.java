package com.designPrinciple.interfaceIsolation;

public class App {
    public static void main(String[] args) {
        ADoor aDoor = new ADoor();
        BDoor bDoor = new BDoor();
        aDoor.options();
        bDoor.options();
    }
}
