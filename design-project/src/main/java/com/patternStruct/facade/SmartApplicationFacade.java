package com.patternStruct.facade;

public class SmartApplicationFacade {
    private TV tv;
    private Light light;

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    public void on() {
    }

    public void off() {
    }

    public void say(String type) {
        if (type.equals("on")) {
            tv.on();
            light.on();
        } else {
            tv.off();
            light.off();
        }
    }
}
