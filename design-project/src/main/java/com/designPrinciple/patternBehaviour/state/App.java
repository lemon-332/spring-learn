package com.designPrinciple.patternBehaviour.state;

public class App {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new OpeningState());
        context.open();

        context.close();
    }
}
