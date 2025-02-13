package com.patternStruct.proxy.jdkProxy;

import com.patternStruct.proxy.staticProxy.SellTickets;

public class App {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
    }
}
