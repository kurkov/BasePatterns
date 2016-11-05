package com.github.kurkov.basepatterns.structural.decorator.pattern;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Aleksey Kurkov. Created on 06.11.2016
 */
public class DecoratorTest {

    @Test
    public void createComponent() {
        Component component = new ConcreteComponent();
        assertEquals("ConcreteComponent operation.", component.operation());
    }

    @Test
    public void createDecoratedComponent() {
        Component component = new ConcreteComponent();
        Component decorator = new ConcreteDecorator(component);
        assertEquals("ConcreteDecorator operation.", decorator.operation());
    }
}