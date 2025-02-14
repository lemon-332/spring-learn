package com.patternStruct.facade;

public class Light extends SmartApplicationFacade {
    @Override
    public void on() {
        System.out.println("开灯");
    }

    @Override
    public void off() {
        System.out.println("关灯");
    }
}
