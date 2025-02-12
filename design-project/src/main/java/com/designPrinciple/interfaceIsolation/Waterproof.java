package com.designPrinciple.interfaceIsolation;

public interface Waterproof {
    default void waterproof(){
        System.out.println("防水");
    }
}
