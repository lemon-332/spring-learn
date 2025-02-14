package com.patternStruct.xianyuan;

public abstract class AbstractBox {
    public abstract String getShape();

    public void display(String color) {
        System.out.println("形状：" + getShape() + " 颜色：" + color);
    }
}
