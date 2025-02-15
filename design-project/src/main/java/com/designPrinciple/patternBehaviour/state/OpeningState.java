package com.designPrinciple.patternBehaviour.state;

public class OpeningState extends LiftState {
    @Override
    public void open() {
        System.out.println("电梯门开启");
    }

    @Override
    public void close() {
        super.context.setState(Context.CLOSING_STATE);
        super.context.close();
        System.out.println("停止了");
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
