package com.pattern.sington.lhan2;

public class App {
    public static void main(String[] args) {
    Singleton instance = Singleton.getInstance();
    Singleton instance2 = Singleton.getInstance();
    System.out.println(instance == instance2);
    }
}
