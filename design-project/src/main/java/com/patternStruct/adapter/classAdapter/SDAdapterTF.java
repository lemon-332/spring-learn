package com.patternStruct.adapter.classAdapter;

// 1. 继承方式实现适配器
public class SDAdapterTF extends TFCardImpl implements SDCard {

    // 2. 引入适配者
    private TFCard tfCard;

    public SDAdapterTF() {
        this.tfCard = tfCard;
    }

    @Override
    public void writeSD() {
        System.out.println("sd write");
        writeTF("hhh");
    }

    @Override
    public void readSD() {
        System.out.println("sd read");
        readTF();
    }
}
