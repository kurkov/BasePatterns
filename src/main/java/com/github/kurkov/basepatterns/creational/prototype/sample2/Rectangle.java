package com.github.kurkov.basepatterns.creational.prototype.sample2;

/**
 * @author Aleksey Kurkov. Created on 13.12.2016
 * @version 1.0
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
