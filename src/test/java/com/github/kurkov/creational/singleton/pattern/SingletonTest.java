package com.github.kurkov.creational.singleton.pattern;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Aleksey Kurkov. Created on 30.10.2016
 */
public class SingletonTest {

    @Test
    public void testUniqueInstance() {
        // Singleton singleton1 = new Singleton(); // - not working, Singleton has private access
        Singleton singleton1 = Singleton.instance();
        Singleton singleton2 = Singleton.instance();
        assertEquals(singleton1, singleton2);
    }

    @Test
    public void testSingletonData() {
        Singleton singleton = Singleton.instance();
        String actualData = singleton.singletonOperation();
        assertEquals("Singleton data", actualData);
    }

}