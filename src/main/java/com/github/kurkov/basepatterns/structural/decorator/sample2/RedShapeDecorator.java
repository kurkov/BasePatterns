package com.github.kurkov.basepatterns.structural.decorator.sample2;

/**
 * @author Aleksey Kurkov. Created on 26.02.2017
 * @version 1.0
 */
public class RedShapeDecorator extends ShapeDecorator {

    private Shape redBorder;

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
