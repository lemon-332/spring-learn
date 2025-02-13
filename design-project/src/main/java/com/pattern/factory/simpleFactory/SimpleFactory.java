package com.pattern.factory.simpleFactory;

public class SimpleFactory {
    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        if ("美式咖啡".equals(type)) {
            coffee = new AmeCoffee();
        } else if ("中式咖啡".equals(type)) {
            coffee = new ChiCoffee();
        }
        return coffee;
    }
}
