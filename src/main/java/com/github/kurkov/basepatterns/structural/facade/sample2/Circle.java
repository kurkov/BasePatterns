package com.github.kurkov.basepatterns.structural.facade.sample2;

/**
 * @author Aleksey Kurkov. Created on 01.03.2017
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
