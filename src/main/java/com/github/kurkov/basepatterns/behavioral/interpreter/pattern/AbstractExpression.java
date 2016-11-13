package com.github.kurkov.basepatterns.behavioral.interpreter.pattern;

/**
 * @author Aleksey Kurkov. Created on 13.11.2016
 */
public interface AbstractExpression {
    boolean interpret(Context context);
}
