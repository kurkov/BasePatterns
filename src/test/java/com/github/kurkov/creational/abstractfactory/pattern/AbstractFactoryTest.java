package com.github.kurkov.creational.abstractfactory.pattern;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Aleksey Kurkov. Created on 30.10.2016
 */
public class AbstractFactoryTest {

    private Client client;

    @Test
    public void createProductA() throws Exception {
        client = new Client();
        assertEquals(ConcreteProductA.class, client.getProductA().getClass());
    }

    @Test
    public void createProductB() throws Exception {
        client = new Client();
        assertEquals(ConcreteProductB.class, client.getProductB().getClass());
    }

}