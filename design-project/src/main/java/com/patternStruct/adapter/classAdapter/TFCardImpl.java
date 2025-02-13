package com.patternStruct.adapter.classAdapter;

public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        System.out.println("TF读取数据");
        return "TF读取数据";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TF写入数据：" + msg);
    }
}
