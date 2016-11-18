package com.github.kurkov.basepatterns.behavioral.state.pattern;

/**
 * @author Aleksey Kurkov. Created on 18.11.2016
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        State state = new ConcreteState1();

        context.setState(state);
        context.handle();

        context.request();
        context.handle();
    }
}
