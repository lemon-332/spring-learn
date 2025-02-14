package com.patternStruct.decorator;

public class FriedNoodles extends FastFood {

    public FriedNoodles() {
        super(14.0f, "炒面");
    }

    @Override
    public float cost() {
        return super.getPrice();
    }
}
