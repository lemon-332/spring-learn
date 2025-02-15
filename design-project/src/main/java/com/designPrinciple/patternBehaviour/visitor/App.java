package com.designPrinciple.patternBehaviour.visitor;

public class App {
    public static void main(String[] args) {
        Home home = new Home();
        home.addAnimal(new Dog());
        home.action(new HomeOwner());
    }
}
