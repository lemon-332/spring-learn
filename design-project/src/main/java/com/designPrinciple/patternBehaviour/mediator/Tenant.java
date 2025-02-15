package com.designPrinciple.patternBehaviour.mediator;

public class Tenant extends Person {
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void contact(String message) {
        mediator.constact(message, this);
    }

    public void getMessage(String message) {
        System.out.println("租客" + name + "收到消息：" + message);
    }
}
