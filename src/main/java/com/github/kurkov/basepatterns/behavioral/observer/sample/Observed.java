package com.github.kurkov.basepatterns.behavioral.observer.sample;

/**
 * @author Aleksey Kurkov. Created on 19.11.2016
 */
public interface Observed {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
