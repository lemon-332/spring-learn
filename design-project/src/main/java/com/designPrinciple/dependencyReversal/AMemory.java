package com.designPrinciple.dependencyReversal;

public class AMemory implements Memory{

    @Override
    public void save() {
        System.out.println("A内存条保存数据");
    }
}
