package com.designPrinciple.patternBehaviour.state;

public class Context {
    public final static OpeningState OPENING_STATE = new OpeningState();
    public final static CloseingState CLOSING_STATE = new CloseingState();
    public final static RungingState RUNNING_STATE = new RungingState();
    public final static StopingState STOPPING_STATE = new StopingState();

    private LiftState state;

    public LiftState getState() {
        return state;
    }

    public void setState(LiftState state) {
        this.state = state;
        this.state.setContext(this);
    }

    public void open() {
        this.state.open();
    }

    public void close() {
        this.state.close();
    }

    public void run() {
        this.state.run();
    }

    public void stop() {
        this.state.stop();
    }
}
