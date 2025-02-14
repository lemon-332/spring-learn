package com.patternStruct.decorator;

public class FriedRice extends FastFood {
    public FriedRice() {
        super(10.0f, "炒饭");
    }

    @Override
    public float cost() {
        return super.getPrice();
    }
}
