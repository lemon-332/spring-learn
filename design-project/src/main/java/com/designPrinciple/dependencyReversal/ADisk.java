package com.designPrinciple.dependencyReversal;

public class ADisk implements Disk{
    @Override
    public void save() {
        System.out.println("ADisk save");
    }

    @Override
    public void get() {
        System.out.println("ADisk get");
    }
}
