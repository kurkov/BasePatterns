package com.github.kurkov.basepatterns.creational.builder.sample2;

/**
 * @author Aleksey Kurkov. Created on 10.12.2016
 * @version 1.0
 */
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
