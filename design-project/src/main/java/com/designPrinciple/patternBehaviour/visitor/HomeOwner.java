package com.designPrinciple.patternBehaviour.visitor;

public class HomeOwner implements Person {
    @Override
    public void feed(Dog dog) {
        System.out.println("HomeOwner feed dog");
    }
}
