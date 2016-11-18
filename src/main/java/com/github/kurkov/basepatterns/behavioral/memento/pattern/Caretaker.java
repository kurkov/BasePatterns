package com.github.kurkov.basepatterns.behavioral.memento.pattern;

/**
 * @author Aleksey Kurkov. Created on 18.11.2016
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
