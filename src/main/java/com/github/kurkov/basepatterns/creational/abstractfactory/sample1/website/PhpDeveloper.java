package com.github.kurkov.basepatterns.creational.abstractfactory.sample1.website;

import com.github.kurkov.basepatterns.creational.abstractfactory.sample1.Developer;

/**
 * @author Aleksey Kurkov. Created on 30.10.2016
 */
public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
