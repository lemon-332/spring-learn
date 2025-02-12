package com.designPrinciple.Liskov;

public class App {
    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() < rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    public static void printLenAndWid(Quadrilateral qua) {
        System.out.println(qua.getLength());
        System.out.println(qua.getWidth());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(20);
        rectangle.setLength(90);
        resize(rectangle);
        printLenAndWid(rectangle);
    }
}
