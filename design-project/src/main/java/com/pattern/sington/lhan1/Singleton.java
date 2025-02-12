package com.pattern.sington.lhan1;

// 懒汉式
public class Singleton {
    private Singleton() {
    }

    // volatile 保证可见性和有序性
    private static volatile Singleton instance;

    // 如果没有 synchronized 线程就不安全
    //    public static synchronized Singleton getInstance() {
    //        if (instance == null) {
    //            instance = new Singleton();
    //            return instance;
    //        }
    //        return instance;
    //    }

    // 对于getInstance来说，绝大部分的操作都是读操作，读操作是线程安全的，所以我们没必
    // 让每个线程必须持有锁才能调用该方法
    // 但是，在多线程的情况下，可能出现空指针的问题，原因是jvm在实例化对象会进行优化和指令
    // 重排序，导致一个线程判断instance为null，但是还没来得及实例化，另一个线程也判断
    // 要解决只需使用 volatile，可以保证可见性和有序性
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
