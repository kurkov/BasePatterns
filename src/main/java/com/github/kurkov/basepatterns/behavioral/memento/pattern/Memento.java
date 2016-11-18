package com.github.kurkov.basepatterns.behavioral.memento.pattern;

/**
 * @author Aleksey Kurkov. Created on 18.11.2016
 */
public class Memento {
    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
