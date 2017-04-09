package com.github.kurkov.basepatterns.behavioral.state.sample2;

/**
 * @author Aleksey Kurkov. Created on 09.04.2017
 * @version 1.0
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}
