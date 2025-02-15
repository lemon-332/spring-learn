package com.designPrinciple.patternBehaviour.observe;

public class App {
    public static void main(String[] args) {
        WeixinObeserver weixinObeserver = new WeixinObeserver();
        WeixinObeserver weixinObeserver1 = new WeixinObeserver();
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();
        subscriptionSubject.registerObserver(weixinObeserver);
        subscriptionSubject.registerObserver(weixinObeserver1);
        subscriptionSubject.notifyObserver("java设计模式");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                subscriptionSubject.notifyObserver("前端vue开发");
            }
        });

        thread.start();
    }
}
