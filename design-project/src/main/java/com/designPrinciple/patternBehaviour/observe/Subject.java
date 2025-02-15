package com.designPrinciple.patternBehaviour.observe;

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver(String msg);
}
