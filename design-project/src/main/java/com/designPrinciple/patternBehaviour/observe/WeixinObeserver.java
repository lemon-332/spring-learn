package com.designPrinciple.patternBehaviour.observe;

public class WeixinObeserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("微信收到消息：" + message);
    }
}
