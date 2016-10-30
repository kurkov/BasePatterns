package com.github.kurkov.creational.abstractfactory.sample.website;

import com.github.kurkov.creational.abstractfactory.sample.Developer;

/**
 * @author Aleksey Kurkov. Created on 30.10.2016
 */
public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
