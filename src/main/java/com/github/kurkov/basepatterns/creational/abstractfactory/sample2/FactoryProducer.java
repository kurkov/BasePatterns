package com.github.kurkov.basepatterns.creational.abstractfactory.sample2;

/**
 * @author Aleksey Kurkov. Created on 28.11.2016
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choise) {

        if (choise.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();

        } else if (choise.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }

        return null;
    }
}
