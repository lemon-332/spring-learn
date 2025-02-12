package com.pattern.sington.destroy2;

import java.io.Serializable;

public class Singleton {

    // 解决放射破坏单例模式
    private static boolean flag = false;

    private Singleton() {
        synchronized (Singleton.class) {
            if (flag) {
                throw new RuntimeException("单例模式被破坏");
            }
            flag = true;
        }

    }

    private static class SingletonHolder {
        private static Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}