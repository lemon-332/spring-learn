package com.patternStruct.bridge;

public class App {
    public static void main(String[] args) {
        Windows windows = new Windows(new AVIFile());
        windows.play("a.avi");
    }
}
