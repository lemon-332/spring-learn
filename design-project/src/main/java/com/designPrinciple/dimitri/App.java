package com.designPrinciple.dimitri;

public class App {
    public static void main(String[] args) {
        Agent agent = new Agent();
        Star star = new Star();
        star.setName("dimitri");
        Fans fans = new Fans();
        fans.setName("hjj");
        Company company = new Company();
        company.setName("company");
        agent.setStar(star);
        agent.setFans(fans);
        agent.setCompany(company);

        agent.meeting();
        agent.business();

    }
}
