package com.pattern.sington.destroy1;

import java.io.*;

public class App {
    // 破坏单例模式 通过序列化和反序列化
    public static void main(String[] args) throws Exception {
//        writeObject2File();
        readObjectFromFile();
//        readObjectFromFile();

    }

    // 向文件中写数据
    public static void writeObject2File() throws Exception {
        Singleton instance = Singleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\lemon\\Desktop\\a.txt"));
        oos.writeObject(instance);
        oos.close();
    }
    // 向文件读数据

    public static void readObjectFromFile() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\lemon\\Desktop\\a.txt"));
        Object object = ois.readObject();
        System.out.println(object);
        ois.close();
    }
}
