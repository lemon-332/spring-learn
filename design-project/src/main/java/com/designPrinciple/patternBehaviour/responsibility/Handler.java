package com.designPrinciple.patternBehaviour.responsibility;

public abstract class Handler {
    private Handler nextHandler;
    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;

    protected final static int NUM_FIVE = 5;

    int numStart;
    int numEnd;


    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(LeaveRequest leave);

    public final void submit(LeaveRequest leave) {
        if (nextHandler != null && leave.getDays() > numEnd) {
            nextHandler.handleRequest(leave);
        } else {
            System.out.println("流程结束");
        }
    }
}
