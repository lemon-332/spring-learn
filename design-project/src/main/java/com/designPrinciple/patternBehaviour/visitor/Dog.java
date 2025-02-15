package com.designPrinciple.patternBehaviour.visitor;

public class Dog implements Animal {
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("dog accept ");
    }
}
