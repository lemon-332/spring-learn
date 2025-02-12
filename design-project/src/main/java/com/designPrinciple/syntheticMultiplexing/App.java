package com.designPrinciple.syntheticMultiplexing;

public class App {
    public static void main(String[] args) {
        PetrolCar car = new PetrolCar();
        Color red = new Red();
        car.setColor(red);
        car.setName("aidi");
        car.move();
    }
}
