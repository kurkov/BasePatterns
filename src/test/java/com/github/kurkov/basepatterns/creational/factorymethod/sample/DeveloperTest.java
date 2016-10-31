package com.github.kurkov.basepatterns.creational.factorymethod.sample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Aleksey Kurkov. Created on 30.10.2016
 */
public class DeveloperTest {

    @Test
    public void javaDeveloperTest() throws Exception {
        Developer developer = new JavaDeveloper();
        assertEquals(JavaDeveloper.class, developer.getClass());
        developer.writeCode();
    }

    @Test
    public void cppDeveloperTest() throws Exception {
        Developer developer = new CppDeveloper();
        assertEquals(CppDeveloper.class, developer.getClass());
        developer.writeCode();
    }

    @Test
    public void phpDeveloperTest() throws Exception {
        Developer developer = new PhpDeveloper();
        assertEquals(PhpDeveloper.class, developer.getClass());
        developer.writeCode();
    }
}