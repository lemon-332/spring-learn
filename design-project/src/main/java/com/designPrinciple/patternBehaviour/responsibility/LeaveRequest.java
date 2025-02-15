package com.designPrinciple.patternBehaviour.responsibility;

public class LeaveRequest {
    private String name;
    private int days;
    private String reason;

    public LeaveRequest(String name, int days, String reason) {
        this.name = name;
        this.days = days;
        this.reason = reason;
    }

    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }

    public String getReason() {
        return reason;
    }
}
