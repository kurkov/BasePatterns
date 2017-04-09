package com.github.kurkov.basepatterns.behavioral.state.sample2;

/**
 * @author Aleksey Kurkov. Created on 09.04.2017
 * @version 1.0
 */
public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
