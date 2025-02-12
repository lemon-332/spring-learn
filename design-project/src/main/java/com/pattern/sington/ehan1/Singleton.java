package com.pattern.sington.ehan1;

// 饿汉式 静态成员变量
public class Singleton {
    // 1. 私有构造方法
    private Singleton() {
    }

    // 2. 在类内部实例化一个实例
    private static Singleton instance = new Singleton();
    // 3. 提供一个公有的方法供外部获取实例

    public static Singleton getInstance() {
        return instance;
    }
}
