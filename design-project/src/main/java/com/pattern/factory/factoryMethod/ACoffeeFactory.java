package com.pattern.factory.factoryMethod;

public class ACoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        ACoffee aCoffee = new ACoffee();

        System.out.println(aCoffee.getName());
        return aCoffee;
    }
}
