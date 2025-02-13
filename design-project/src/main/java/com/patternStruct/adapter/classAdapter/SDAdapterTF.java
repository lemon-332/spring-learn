package com.patternStruct.adapter.classAdapter;

public class SDAdapterTF extends TFCardImpl implements SDCard {
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
