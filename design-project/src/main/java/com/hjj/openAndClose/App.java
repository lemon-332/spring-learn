package com.hjj.openAndClose;

public class App {
    public static void main(String[] args) {
//        SouGouSkin souGouSkin = new SouGouSkin(new DefaultSpecificSkin());
        SouGouSkin souGouSkin = new SouGouSkin(new CustomSpecificSkin());
        souGouSkin.display();
    }
}
