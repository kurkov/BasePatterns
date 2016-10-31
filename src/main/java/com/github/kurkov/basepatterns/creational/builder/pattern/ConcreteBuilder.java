package com.github.kurkov.basepatterns.creational.builder.pattern;

/**
 * @author Aleksey Kurkov. Created on 31.10.2016
 */
public class ConcreteBuilder extends Builder {

    private ObjectPart objectPart;

    @Override
    public void buildPart() {
        objectPart = new ObjectPart("New object data");
    }

    @Override
    public ObjectPart getResult() {
        return objectPart;
    }
}
