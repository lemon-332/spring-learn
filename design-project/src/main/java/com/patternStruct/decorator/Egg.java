package com.patternStruct.decorator;

public class Egg extends Garnish {
    public Egg(FastFood fastFood) {
        super(fastFood, "记得", 1.5f);
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDescr() {
        return super.getDescr() + getFastFood().getDescr();
    }
}
