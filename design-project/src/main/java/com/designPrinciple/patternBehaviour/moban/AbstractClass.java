package com.designPrinciple.patternBehaviour.moban;

public abstract class AbstractClass {
    public final void cookProcess() {
        this.pourOll();
        this.pourVegetable();
        this.pourSauce();
        this.fry();
    }

    public void pourOll() {
        System.out.println("倒油");
    }

    public void fry() {
        System.out.println("炒");
    }

    public abstract void pourVegetable();

    public abstract void pourSauce();
}
