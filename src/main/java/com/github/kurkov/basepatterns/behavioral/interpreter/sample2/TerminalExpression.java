package com.github.kurkov.basepatterns.behavioral.interpreter.sample2;

/**
 * @author Aleksey Kurkov. Created on 27.03.2017
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
