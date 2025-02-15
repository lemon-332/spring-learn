package com.designPrinciple.patternBehaviour.memento.whiteBox;

public class App {
    public static void main(String[] args) {
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.stateDisplay();
        roleStateCaretaker.setRoleStateMemento(gameRole.saveState());

        gameRole.fight();
        gameRole.stateDisplay();

        gameRole.recoverState(roleStateCaretaker.getRoleStateMemento());
        gameRole.stateDisplay();

    }
}
