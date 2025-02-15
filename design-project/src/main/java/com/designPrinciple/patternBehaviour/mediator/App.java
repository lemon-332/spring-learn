package com.designPrinciple.patternBehaviour.mediator;

public class App {
    public static void main(String[] args) {
        MediatorStructure mediator = new MediatorStructure();
        Tenant colleague1 = new Tenant("李三", mediator);
        HouseOwner colleague2 = new HouseOwner("周四", mediator);
        mediator.setTenant(colleague1);
        mediator.setHouseOwner(colleague2);
        colleague1.contact("我想租一个三室一厅的房子");
        colleague2.contact("我有一套两室一厅的房子，月租2000元");
    }
}
