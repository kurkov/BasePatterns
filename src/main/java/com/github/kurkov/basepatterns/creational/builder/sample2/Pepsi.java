package com.github.kurkov.basepatterns.creational.builder.sample2;

/**
 * @author Aleksey Kurkov. Created on 10.12.2016
 * @version 1.0
 */
public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
