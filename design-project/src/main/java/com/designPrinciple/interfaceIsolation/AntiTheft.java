package com.designPrinciple.interfaceIsolation;

public interface AntiTheft {
    default void antiTheft(){
        System.out.println("防盗");
    }
}
