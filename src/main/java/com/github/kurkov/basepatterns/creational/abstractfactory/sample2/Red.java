package com.github.kurkov.basepatterns.creational.abstractfactory.sample2;

/**
 * @author Aleksey Kurkov. Created on 28.11.2016
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
