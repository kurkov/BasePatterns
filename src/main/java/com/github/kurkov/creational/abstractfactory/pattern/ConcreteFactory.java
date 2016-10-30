package com.github.kurkov.creational.abstractfactory.pattern;

/**
 * @author Aleksey Kurkov. Created on 30.10.2016
 */
public class ConcreteFactory implements AbstractFactory {
    @Override
    public AbstractProduct createProductA() {
        return new ConcreteProductA();
    }

    @Override
    public AbstractProduct createProductB() {
        return new ConcreteProductB();
    }
}
