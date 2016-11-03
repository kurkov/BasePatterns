package com.github.kurkov.basepatterns.structural.bridge.sample;

/**
 * @author Aleksey Kurkov. Created on 03.11.2016
 */
public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writing Java code...");
    }
}
