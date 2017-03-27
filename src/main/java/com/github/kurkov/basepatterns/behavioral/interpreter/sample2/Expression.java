package com.github.kurkov.basepatterns.behavioral.interpreter.sample2;

/**
 * @author Aleksey Kurkov. Created on 27.03.2017
 */
public interface Expression {
    boolean interpret(String context);
}
