package com.github.kurkov.basepatterns.behavioral.observer.pattern;

/**
 * @author Aleksey Kurkov. Created on 19.11.2016
 */
public class ConcreteObserver implements Observer {
    private String observerState;

    @Override
    public void update(String state) {
        this.observerState = state;
        System.out.println("State is updated: " + observerState);
    }
}
