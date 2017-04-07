package com.github.kurkov.basepatterns.behavioral.observer.sample2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksey Kurkov. Created on 07.04.2017
 * @version 1.0
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
