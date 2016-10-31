package com.github.kurkov.basepatterns.creational.builder.pattern;

/**
 * @author Aleksey Kurkov. Created on 31.10.2016
 */
public abstract class Builder {

    public abstract void buildPart();

    public abstract ObjectPart getResult();
}
