package com.patternStruct.decorator;

public abstract class FastFood {
    protected float price;
    protected String descr;

    public abstract float cost();

    public FastFood() {
    }

    public FastFood(float price, String descr) {
        this.price = price;
        this.descr = descr;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
}
