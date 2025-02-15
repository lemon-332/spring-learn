package com.designPrinciple.patternBehaviour.responsibility;

public class Manager extends Handler {

    public Manager() {
        super(3, Handler.NUM_FIVE);
    }

    public Manager(int numStart, int numEnd) {
        super(numStart, numEnd);
    }

    public void handleRequest(LeaveRequest leave) {
        System.out.println("经理处理了" + leave.getName() + "的请假申请");
        System.out.println("总经理同意");
    }
}
