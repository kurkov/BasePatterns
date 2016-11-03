package com.github.kurkov.basepatterns.structural.bridge.pattern;

/**
 * @author Aleksey Kurkov. Created on 03.11.2016
 */
public abstract class Abstraction {
    protected Implementor implementor;

    protected Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();
}
