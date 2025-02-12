package com.designPrinciple.interfaceIsolation;

public interface Fireproof {
    default void fireproof(){
        System.out.println("防火");
    }
}
