package com.designPrinciple.openAndClose;

public class SouGouSkin {
    private AbstractSkin skin;

    public SouGouSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        skin.display();
    }
}
