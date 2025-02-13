package com.pattern.factory.simpleFactoryExtend;

public class App {
    public static void main(String[] args) {
        Coffee aCoffee = CoffeeFactory.createCoffee("aCoffee");
        aCoffee.addMilk();
        aCoffee.addSugar();
    }
}
