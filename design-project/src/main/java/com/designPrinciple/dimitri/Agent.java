package com.designPrinciple.dimitri;

public class Agent {
    Star star;
    Fans fans;
    Company company;

    void meeting() {
        System.out.println(star.getName() + "meet with fans" + fans.getName());
    }
    void business(){
        System.out.println(star.getName() + "business with company" + company.getName());
    }

    public Agent() {
    }

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public Fans getFans() {
        return fans;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
