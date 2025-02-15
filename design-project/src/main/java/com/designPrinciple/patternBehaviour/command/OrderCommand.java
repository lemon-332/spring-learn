package com.designPrinciple.patternBehaviour.command;

import java.util.Map;

public class OrderCommand implements Command {
    private SeniorChef receiver;

    private Order order;

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + "桌的订单被接收");
        Map<String, Integer> foodDic = order.getFoodDic();
        for (String s : foodDic.keySet()) {
            receiver.makeFood(s, foodDic.get(s));
        }
        System.out.println(order.getDiningTable() + "桌的订单已制作完成");
    }
}
