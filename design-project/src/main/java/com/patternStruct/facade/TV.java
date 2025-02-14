package com.patternStruct.facade;

public class TV extends SmartApplicationFacade {


    @Override
    public void on() {
        System.out.println("打开电视");
    }

    @Override
    public void off() {
        System.out.println("关闭电视");
    }
}
