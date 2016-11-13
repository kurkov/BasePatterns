package com.github.kurkov.basepatterns.behavioral.interpreter.sample;

/**
 * @author Aleksey Kurkov. Created on 13.11.2016
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
