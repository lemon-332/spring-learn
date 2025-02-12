package com.pattern.sington.destroy1;

import java.io.Serializable;

public class Singleton implements Serializable {
    private Singleton() {
    }

    private static class SingletonHolder {
        private static Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    // 解决虚虚拟化和反序列化导致的单例模式的破坏
    // 当进行反序列化，会自动调用该方法，没有的话就会新new一个对象
    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}