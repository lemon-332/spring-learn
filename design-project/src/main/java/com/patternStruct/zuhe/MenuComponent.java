package com.patternStruct.zuhe;

public abstract class MenuComponent {
    protected String name;

    protected int level;

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException("不支持获取子菜单操作");
    }

    public String getName() {
        return name;
    }

    public abstract void print();
}
