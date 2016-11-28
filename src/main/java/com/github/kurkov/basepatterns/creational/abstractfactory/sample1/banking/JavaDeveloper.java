package com.github.kurkov.basepatterns.creational.abstractfactory.sample1.banking;

import com.github.kurkov.basepatterns.creational.abstractfactory.sample1.Developer;

/**
 * @author Aleksey Kurkov. Created on 30.10.2016
 */
public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
