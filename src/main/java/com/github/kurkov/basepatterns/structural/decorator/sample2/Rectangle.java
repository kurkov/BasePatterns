package com.github.kurkov.basepatterns.structural.decorator.sample2;

/**
 * @author Aleksey Kurkov. Created on 26.02.2017
 * @version 1.0
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
