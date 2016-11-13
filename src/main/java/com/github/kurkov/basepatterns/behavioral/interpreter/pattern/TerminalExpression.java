package com.github.kurkov.basepatterns.behavioral.interpreter.pattern;

/**
 * @author Aleksey Kurkov. Created on 13.11.2016
 */
public class TerminalExpression implements AbstractExpression {
    private Context data;

    public TerminalExpression(Context data) {
        this.data = data;
    }

    @Override
    public boolean interpret(Context context) {
        return context.getData().contains(data.getData());
    }
}
