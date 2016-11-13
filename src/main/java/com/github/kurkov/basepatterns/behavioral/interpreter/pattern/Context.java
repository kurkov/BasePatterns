package com.github.kurkov.basepatterns.behavioral.interpreter.pattern;

/**
 * @author Aleksey Kurkov. Created on 13.11.2016
 */
public class Context {
    private String data;

    public Context(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
