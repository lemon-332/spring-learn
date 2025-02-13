package com.pattern.create1;

public class App {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .frame(" frame")
                .screen("a screen")
                .build();
        System.out.println(phone);
    }
}
