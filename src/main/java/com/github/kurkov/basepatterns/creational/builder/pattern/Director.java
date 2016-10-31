package com.github.kurkov.basepatterns.creational.builder.pattern;

/**
 * @author Aleksey Kurkov. Created on 31.10.2016
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public ObjectPart construct() {
        builder.buildPart();

        return builder.getResult();
    }
}
