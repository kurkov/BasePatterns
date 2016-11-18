package com.github.kurkov.basepatterns.behavioral.memento.pattern;

/**
 * @author Aleksey Kurkov. Created on 18.11.2016
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // save state
    public Memento createMemento() {
        return new Memento(state);
    }

    // restore state
    public void setMemento(Memento m) {
        this.state = m.getState();
    }
}
