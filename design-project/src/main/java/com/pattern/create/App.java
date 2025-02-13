package com.pattern.create;

public class App {
    public static void main(String[] args) {
        Director director = new Director(new ABuilder());
        Bike construct = director.construct();
        System.out.println(construct.getFrame());
    }
}
