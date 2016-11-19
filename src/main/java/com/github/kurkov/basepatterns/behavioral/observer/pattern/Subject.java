package com.github.kurkov.basepatterns.behavioral.observer.pattern;

/**
 * @author Aleksey Kurkov. Created on 19.11.2016
 */
public interface Subject {
    void attach(Observer o);

    void detach(Observer o);

    void notifyObservers();
}
