package com.designPrinciple.patternBehaviour.responsibility;

public class GroupLeader extends Handler {

    public GroupLeader() {
        super(1, Handler.NUM_THREE);
    }

    public GroupLeader(int numStart, int numEnd) {
        super(numStart, numEnd);
    }

    @Override
    public void handleRequest(LeaveRequest leave) {
        if (leave.getDays() <= super.numEnd) {
            System.out.println(leave.getName() + "请假" + leave.getDays() + "天，" + leave.getReason());
            System.out.println("GroupLeader批准了");
        } else {
            submit(leave);
        }
    }
}
