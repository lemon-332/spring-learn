package com.designPrinciple.patternBehaviour.visitor;

import java.util.ArrayList;
import java.util.List;

public class Home {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void action(Person person) {
        animals.forEach(animal -> animal.accept(person));
    }
}
