package com.designPrinciple.interfaceIsolation;

public class ADoor implements AntiTheft,Fireproof,Waterproof{
    void options(){
        antiTheft();
        fireproof();
        waterproof();
    }
}
