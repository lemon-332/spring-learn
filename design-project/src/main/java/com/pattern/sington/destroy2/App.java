package com.pattern.sington.destroy2;

import java.lang.reflect.Constructor;

public class App {
    // 通过反射破坏单例模式
    public static void main(String[] args) throws Exception {
        Class<Singleton> clazz = Singleton.class;
        // 获取无参构造
        Constructor<Singleton> cons = clazz.getDeclaredConstructor();
        // 取消访问检查
        cons.setAccessible(true);
        Singleton singleton = cons.newInstance();
        Singleton singleton1 = cons.newInstance();
        System.out.println(singleton == singleton1);
    }
}
