package com.github.kurkov.basepatterns.behavioral.memento.sample2;

/**
 * @author Aleksey Kurkov. Created on 03.04.2017
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
