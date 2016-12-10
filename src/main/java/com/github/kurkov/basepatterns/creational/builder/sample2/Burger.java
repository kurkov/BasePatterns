package com.github.kurkov.basepatterns.creational.builder.sample2;

/**
 * @author Aleksey Kurkov. Created on 10.12.2016
 * @version 1.0
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
