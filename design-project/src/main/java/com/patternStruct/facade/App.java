package com.patternStruct.facade;

public class App {
    public static void main(String[] args) {
        SmartApplicationFacade smartApplicationFacade = new SmartApplicationFacade();
        smartApplicationFacade.setTv(new TV());
        smartApplicationFacade.setLight(new Light());
        smartApplicationFacade.say("on");

    }
}
