package com.patternStruct.decorator;

public class App {
    public static void main(String[] args) {
        FriedRice rice = new FriedRice();
        System.out.println(rice.getDescr() + " " + rice.cost());
        Egg egg = new Egg(rice);
        System.out.println(egg.getDescr() + " " + egg.cost());
    }
}
