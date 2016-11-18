package com.github.kurkov.basepatterns.behavioral.state.pattern;

/**
 * @author Aleksey Kurkov. Created on 18.11.2016
 */
public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        if (state instanceof ConcreteState1) {
            setState(new ConcreteState2());
        } else if (state instanceof ConcreteState2) {
            setState(new ConcreteState1());
        }
    }

    public void handle() {
        state.handle();
    }
}
