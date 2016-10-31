package com.github.kurkov.basepatterns.creational.factorymethod.sample;

/**
 * @author Aleksey Kurkov. Created on 30.10.2016
 */
public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("C++ developer writes C++ code...");
    }
}
