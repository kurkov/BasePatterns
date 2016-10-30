package com.github.kurkov.creational.abstractfactory.sample.banking;

import com.github.kurkov.creational.abstractfactory.sample.Developer;

/**
 * @author Aleksey Kurkov. Created on 30.10.2016
 */
public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
