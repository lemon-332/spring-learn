package com.patternStruct.bridge;

public class AVIFile implements VideoFile {
    @Override
    public void decode(String fileName) {
        System.out.println("avi文件解码" + fileName);
    }
}
