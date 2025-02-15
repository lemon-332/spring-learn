package com.designPrinciple.patternBehaviour.memento.blackBox;

import com.designPrinciple.patternBehaviour.memento.whiteBox.RoleStateMemento;

public class RoleStateCaretaker {
    private Memento memento;

    public Memento getRoleStateMemento() {
        return memento;
    }

    public void setRoleStateMemento(Memento memento) {
        this.memento = memento;
    }
}
