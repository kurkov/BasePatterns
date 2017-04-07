package com.github.kurkov.basepatterns.behavioral.observer.sample2;

/**
 * @author Aleksey Kurkov. Created on 07.04.2017
 * @version 1.0
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
