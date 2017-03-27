package com.github.kurkov.basepatterns.behavioral.interpreter.sample1;

/**
 * @author Aleksey Kurkov. Created on 13.11.2016
 */
public interface Expression {
    boolean interpret(String context);
}
