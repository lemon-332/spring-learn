package com.designPrinciple.patternBehaviour.command;

public class App {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Order order = new Order();
        order.setDiningTable(1);
        order.setFood("鱼香肉丝", 5);
        order.setFood("西红柿", 4);
        OrderCommand command = new OrderCommand(new SeniorChef(), order);
        waiter.setCommand(command);
        waiter.executeCommands();
    }
}
