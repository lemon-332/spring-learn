package com.designPrinciple.patternBehaviour.mediator;

public class HouseOwner extends Person {
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void contact(String message) {
        mediator.constact(message, this);
    }

    public void getMessage(String message) {
        System.out.println("房主" + name + "收到信息：" + message);
    }


}
