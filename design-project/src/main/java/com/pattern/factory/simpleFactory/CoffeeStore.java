package com.pattern.factory.simpleFactory;

public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Coffee coffee = simpleFactory.createCoffee(type);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
