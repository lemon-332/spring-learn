package com.pattern.create;

public class ABuilder extends Builder {
    @Override
    public void buildFrame() {
        mbike.setFrame("a Frame");
    }

    @Override
    public void buildSeat() {
        mbike.setSeat("a Seat");
    }

    @Override
    public Bike createBike() {
        return mbike;
    }
}
