package com.designPrinciple.syntheticMultiplexing;

public class PetrolCar extends Car{
    @Override
    void move() {
        color.paint();
        System.out.println(name+"车移动");
    }
}
