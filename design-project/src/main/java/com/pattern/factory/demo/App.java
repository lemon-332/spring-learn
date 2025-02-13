package com.pattern.factory.demo;

public class App {
    public static void main(String[] args) {
    CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("中式咖啡");
        System.out.println(coffee.getName());

    }
}
