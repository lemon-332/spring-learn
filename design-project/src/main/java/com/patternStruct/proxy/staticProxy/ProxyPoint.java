package com.patternStruct.proxy.staticProxy;

public class ProxyPoint implements SellTickets {
    private TrainStation trainStation;

    @Override
    public void sell() {
        System.out.println("代理点收取一些服务费用");
        trainStation.sell();
    }

    public ProxyPoint(TrainStation trainStation) {
        this.trainStation = trainStation;
    }
}
