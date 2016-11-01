package com.github.kurkov.basepatterns.structural.flyweight.pattern;

/**
 * @author Aleksey Kurkov. Created on 01.11.2016
 */
public class ConcreteFlyweight implements Flyweight {

    @Override
    public void operation() {
        System.out.println("Do something...");
    }
}
