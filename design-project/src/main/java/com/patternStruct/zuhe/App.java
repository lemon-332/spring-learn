package com.patternStruct.zuhe;

public class App {
    public static void main(String[] args) {
        MenuComponent menu = new Menu("菜单", 1);
        MenuComponent menu1 = new Menu("菜单1", 2);
        menu1.add(new MenuItem("hh", 3));
        menu1.add(new MenuItem("45", 3));
        MenuComponent menu2 = new Menu("菜单2", 2);
        menu2.add(new MenuItem("87", 3));
        menu.add(menu1);
        menu.add(menu2);
        menu.print();
    }
}
