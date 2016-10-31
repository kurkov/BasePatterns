package com.github.kurkov.basepatterns.creational.factorymethod.sample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Aleksey Kurkov. Created on 30.10.2016
 */
public class DeveloperFactoryTest {

    @Test
    public void createJavaDeveloper() throws Exception {
        DeveloperFactory developerFactory = new JavaDeveloperFactory();
        Developer developer = developerFactory.createDeveloper();
        assertEquals(JavaDeveloper.class, developer.getClass());
        developer.writeCode();
    }

    @Test
    public void createCppDeveloper() throws Exception {
        DeveloperFactory developerFactory = new CppDeveloperFactory();
        Developer developer = developerFactory.createDeveloper();
        assertEquals(CppDeveloper.class, developer.getClass());
        developer.writeCode();
    }

    @Test
    public void createPhpDeveloper() throws Exception {
        DeveloperFactory developerFactory = new PhpDeveloperFactory();
        Developer developer = developerFactory.createDeveloper();
        assertEquals(PhpDeveloper.class, developer.getClass());
        developer.writeCode();
    }

}