package com.github.kurkov.basepatterns.creational.prototype.sample2;

/**
 * @author Aleksey Kurkov. Created on 13.12.2016
 * @version 1.0
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
