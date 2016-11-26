package com.github.kurkov.basepatterns.creational.factorymethod.sample2;

/**
 * @author Aleksey Kurkov. Created on 26.11.2016
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
