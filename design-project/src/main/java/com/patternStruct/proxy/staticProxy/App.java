package com.patternStruct.proxy.staticProxy;

public class App {
    public static void main(String[] args) {
        ProxyPoint proxyPoint = new ProxyPoint(new TrainStation());
        proxyPoint.sell();
    }
}
