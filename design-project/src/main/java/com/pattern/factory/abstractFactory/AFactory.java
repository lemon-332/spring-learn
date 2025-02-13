package com.pattern.factory.abstractFactory;

public class AFactory implements Factory{
    @Override
    public Coffee createCoffee() {
        return new ACoffee();
    }

    @Override
    public Desert createDesert() {
        return new ADesert();
    }
}
