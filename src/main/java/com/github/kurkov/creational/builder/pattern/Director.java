package com.github.kurkov.creational.builder.pattern;

/**
 * @author Aleksey Kurkov. Created on 31.10.2016
 */
public class Director {
    private Builder builder;

    public ObjectPart construct() {
        builder.buildPart();
        ObjectPart objectPart = builder.getResult();

        return objectPart;
    }
}
