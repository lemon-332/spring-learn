package com.patternStruct.decorator;

public abstract class Garnish extends FastFood {
    private FastFood fastFood;

    public Garnish(FastFood fastFood, String desc, float price) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

}
