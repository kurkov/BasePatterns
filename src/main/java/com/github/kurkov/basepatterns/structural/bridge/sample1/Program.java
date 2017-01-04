package com.github.kurkov.basepatterns.structural.bridge.sample1;

/**
 * @author Aleksey Kurkov. Created on 03.11.2016
 */
public abstract class Program {
    protected Developer developer;

    protected Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}
