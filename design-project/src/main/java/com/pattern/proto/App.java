package com.pattern.proto;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realizetype = new Realizetype();
        Realizetype clone = realizetype.clone();
        System.out.println(realizetype == clone);
    }
}
