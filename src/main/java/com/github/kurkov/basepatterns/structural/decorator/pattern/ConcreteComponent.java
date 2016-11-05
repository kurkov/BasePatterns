package com.github.kurkov.basepatterns.structural.decorator.pattern;

/**
 * @author Aleksey Kurkov. Created on 05.11.2016
 */
public class ConcreteComponent implements Component {
    @Override
    public String operation() {
        return "ConcreteComponent operation.";
    }
}
