package com.github.kurkov.basepatterns.behavioral.observer.sample2;

/**
 * @author Aleksey Kurkov. Created on 07.04.2017
 * @version 1.0
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
