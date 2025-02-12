package com.pattern.factory.demo1;

public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        Coffee coffee = null;
        if (type.equals("中式咖啡")) {
            coffee = new ChiCoffee();
        } else if (type.equals("美式咖啡")) {
            coffee = new AmeCoffee();
        }
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
