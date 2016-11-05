package com.github.kurkov.basepatterns.structural.decorator.pattern;

/**
 * @author Aleksey Kurkov. Created on 05.11.2016
 */
public class Decorator implements Component {

    Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public String operation() {
        return component.operation();
    }
}
