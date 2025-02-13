package com.pattern.factory.abstractFactory;

public class App {
    public static void main(String[] args) {
        AFactory aFactory = new AFactory();
        Coffee coffee = aFactory.createCoffee();
        Desert desert = aFactory.createDesert();
        coffee.addMilk();
        desert.show();
    }
}
