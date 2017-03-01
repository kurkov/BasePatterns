package com.github.kurkov.basepatterns.structural.facade.sample2;

/**
 * @author Aleksey Kurkov. Created on 01.03.2017
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}