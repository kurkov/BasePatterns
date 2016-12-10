package com.github.kurkov.basepatterns.creational.builder.sample2;

/**
 * @author Aleksey Kurkov. Created on 10.12.2016
 * @version 1.0
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
