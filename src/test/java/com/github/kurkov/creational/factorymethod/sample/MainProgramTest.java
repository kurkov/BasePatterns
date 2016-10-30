package com.github.kurkov.creational.factorymethod.sample;

import org.junit.Test;

import static com.github.kurkov.creational.factorymethod.sample.MainProgram.createDeveloperBySpeciality;
import static org.junit.Assert.assertEquals;

/**
 * @author Aleksey Kurkov. Created on 30.10.2016
 */
public class MainProgramTest {

    @Test
    public void createJavaDeveloper() throws Exception {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("java");
        Developer developer = developerFactory.createDeveloper();
        assertEquals(JavaDeveloper.class, developer.getClass());
        developer.writeCode();
    }

    @Test
    public void createCppDeveloper() throws Exception {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("c++");
        Developer developer = developerFactory.createDeveloper();
        assertEquals(CppDeveloper.class, developer.getClass());
        developer.writeCode();
    }

    @Test
    public void createPhpDeveloper() throws Exception {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("php");
        Developer developer = developerFactory.createDeveloper();
        assertEquals(PhpDeveloper.class, developer.getClass());
        developer.writeCode();
    }

}