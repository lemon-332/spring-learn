package com.designPrinciple.patternBehaviour.command;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private int diningTable;
    private Map<String, Integer> foodDic = new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDic() {
        return foodDic;
    }

    public void setFood(String name, Integer num) {
        foodDic.put(name, num);
    }
}
