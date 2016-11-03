package com.github.kurkov.basepatterns.structural.bridge.pattern;

/**
 * @author Aleksey Kurkov. Created on 03.11.2016
 */
public class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("ConcreteImplementorA performing operation...");
    }
}
