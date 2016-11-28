package com.github.kurkov.basepatterns.creational.abstractfactory.sample2;

/**
 * @author Aleksey Kurkov. Created on 28.11.2016
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
