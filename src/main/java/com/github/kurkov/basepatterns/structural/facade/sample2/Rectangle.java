package com.github.kurkov.basepatterns.structural.facade.sample2;

/**
 * @author Aleksey Kurkov. Created on 01.03.2017
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
