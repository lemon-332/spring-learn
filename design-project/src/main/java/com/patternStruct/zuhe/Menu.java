package com.patternStruct.zuhe;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {


    private List<MenuComponent> menuComponents = new ArrayList<>();

    public Menu(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponent.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        System.out.println("菜单名称：" + name);
        for (MenuComponent menuComponent : menuComponents) {
            for (int i = 0; i < level; i++) {
                menuComponent.print();
            }
        }
    }
}
