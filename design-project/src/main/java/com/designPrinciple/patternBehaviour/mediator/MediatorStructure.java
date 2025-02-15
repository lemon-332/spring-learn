package com.designPrinciple.patternBehaviour.mediator;

public class MediatorStructure extends Mediator {

    private HouseOwner houseOwner;
    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void constact(String message, Person colleague) {
        if (colleague == houseOwner) {
            tenant.getMessage(message);
        } else if (colleague == tenant) {
            houseOwner.getMessage(message);
        }
    }
}
