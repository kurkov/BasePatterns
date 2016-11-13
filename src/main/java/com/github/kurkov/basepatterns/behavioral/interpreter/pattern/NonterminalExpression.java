package com.github.kurkov.basepatterns.behavioral.interpreter.pattern;

/**
 * @author Aleksey Kurkov. Created on 13.11.2016
 */
public class NonterminalExpression implements AbstractExpression {
    private AbstractExpression expression;

    public NonterminalExpression(AbstractExpression expression) {
        this.expression = expression;
    }

    @Override
    public boolean interpret(Context context) {
        return expression.interpret(context);
    }
}
