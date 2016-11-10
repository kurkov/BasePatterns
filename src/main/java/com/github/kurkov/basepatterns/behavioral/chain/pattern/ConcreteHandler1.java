package com.github.kurkov.basepatterns.behavioral.chain.pattern;

/**
 * @author Aleksey Kurkov. Created on 10.11.2016
 */
public class ConcreteHandler1 extends Handler {

    @Override
    public void handleRequest() {
        System.out.println("ConcreteHandler1 handles request...");
        super.handleRequest();
    }
}
