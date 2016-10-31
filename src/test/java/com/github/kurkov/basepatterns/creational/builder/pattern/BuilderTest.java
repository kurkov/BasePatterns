package com.github.kurkov.basepatterns.creational.builder.pattern;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Aleksey Kurkov. Created on 31.10.2016
 */
public class BuilderTest {

    @Test
    public void testBuilder() {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);

        ObjectPart objectPart = director.construct();
        assertEquals("New object data", objectPart.getData());
    }
}