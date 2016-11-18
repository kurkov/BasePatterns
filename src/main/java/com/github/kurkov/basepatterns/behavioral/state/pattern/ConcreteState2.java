package com.github.kurkov.basepatterns.behavioral.state.pattern;

/**
 * @author Aleksey Kurkov. Created on 18.11.2016
 */
public class ConcreteState2 implements State {
    @Override
    public void handle() {
        System.out.println("ConcreteState2");
    }
}
