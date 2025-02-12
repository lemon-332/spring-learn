package com.pattern.sington.destroy2;

import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;

public class App {
    // 通过反射破坏单例模式
    public static void main(String[] args) throws Exception {
        Class<Singleton> clazz = Singleton.class;
        // 获取无参构造
        Constructor<Singleton> cons = clazz.getDeclaredConstructor();
        // 取消访问检查
        cons.setAccessible(true);
//        Singleton singleton = cons.newInstance();
//        Singleton singleton1 = cons.newInstance();
//        System.out.println(singleton == singleton1);

        Runtime runtime = Runtime.getRuntime();
        Runtime runtime1 = Runtime.getRuntime();
        System.out.println(runtime == runtime1);
        Process exec = runtime1.exec("node -v");
        InputStream is = exec.getInputStream();
        byte[] arr = new byte[1024];
        int len;
        String result = "";

        while ((len = is.read(arr)) != -1) {
            result += new String(arr, 0, len);
        }
        System.out.println(result);
    }
}
