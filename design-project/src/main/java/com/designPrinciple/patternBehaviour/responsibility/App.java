package com.designPrinciple.patternBehaviour.responsibility;

public class App {
    public static void main(String[] args) {
        LeaveRequest leaveRequest = new LeaveRequest("张三", 4, "感冒");
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        groupLeader.setNextHandler(manager);
        groupLeader.handleRequest(leaveRequest);
    }
}
