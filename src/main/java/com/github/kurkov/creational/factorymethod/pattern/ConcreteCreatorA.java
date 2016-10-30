package com.github.kurkov.creational.factorymethod.pattern;

/**
 * @author Aleksey Kurkov. Created on 30.10.2016
 */
public class ConcreteCreatorA extends Creator {

    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
