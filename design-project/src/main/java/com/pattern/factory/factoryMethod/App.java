package com.pattern.factory.factoryMethod;

public class App {
    public static void main(String[] args) {
        CoffeeFactory factory = new ACoffeeFactory();
        CoffeeStore coffeeStore = new CoffeeStore();
        coffeeStore.setFactory(factory);
        coffeeStore.orderCoffee();
    }
}
