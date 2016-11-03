package com.github.kurkov.basepatterns.structural.bridge.pattern;

/**
 * @author Aleksey Kurkov. Created on 03.11.2016
 */
public class ConcreteImplementorB implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("ConcreteImplementorB performing operation...");
    }
}
