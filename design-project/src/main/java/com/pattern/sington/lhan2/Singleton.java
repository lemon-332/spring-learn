package com.pattern.sington.lhan2;

// 由于jvm在加载外部类的过程中，是不会加载静态内部类的，只有内部类的属性/方法被调用时
// 才会被加载，并且初始化，由于被static修饰，保证只加载一次，并且严格保证实例化顺序
public class Singleton {
    private Singleton() {
    }

    private static class SingletonHolder {
        private static Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
