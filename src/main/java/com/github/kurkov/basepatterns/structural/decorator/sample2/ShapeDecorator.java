package com.github.kurkov.basepatterns.structural.decorator.sample2;

/**
 * @author Aleksey Kurkov. Created on 26.02.2017
 * @version 1.0
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
