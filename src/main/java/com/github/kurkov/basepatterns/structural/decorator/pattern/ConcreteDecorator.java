package com.github.kurkov.basepatterns.structural.decorator.pattern;

/**
 * @author Aleksey Kurkov. Created on 06.11.2016
 */
public class ConcreteDecorator extends Decorator {

    private String addedState;

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public String operation() {
        return "ConcreteDecorator operation.";
    }

    public void addedBehaviour() {
        addedState = "Changed addedState.";
    }
}
