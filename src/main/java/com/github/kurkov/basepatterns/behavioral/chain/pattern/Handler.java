package com.github.kurkov.basepatterns.behavioral.chain.pattern;

/**
 * @author Aleksey Kurkov. Created on 10.11.2016
 */
public abstract class Handler {

    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest() {
        if (nextHandler != null) {
            nextHandler.handleRequest();
        }
    }
}
