package com.patternStruct.proxy.jdkProxy;

import com.patternStruct.proxy.staticProxy.SellTickets;
import com.patternStruct.proxy.staticProxy.TrainStation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private SellTickets sellTickets = new TrainStation();


    public SellTickets getProxyObject() {
        /**
         * ClassLoader loader : 类加载器，用于加载代理类。可以通过目标对象获取类加载器
         * Class<?>[] interfaces : 代理类实现的接口的字节码对象
         * InvocationHandler h : 代理类的调用处理程序
         * @return
         */
        SellTickets tickets = (SellTickets) Proxy.newProxyInstance(sellTickets.getClass().getClassLoader(),
                sellTickets.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代收点收取费用");
                        return method.invoke(sellTickets,args);
                    }
                });

        return tickets;
    }
}
