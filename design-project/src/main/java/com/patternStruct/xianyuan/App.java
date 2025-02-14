package com.patternStruct.xianyuan;

public class App {
    public static void main(String[] args) {
        BoxFactory instance = BoxFactory.getInstance();
        AbstractBox i = instance.getBox("I");
        i.display("灰色");
    }
}
