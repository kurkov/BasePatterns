package com.github.kurkov.basepatterns.structural.bridge.sample1;

/**
 * @author Aleksey Kurkov. Created on 03.11.2016
 */
public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("C++ developer writing C++ code...");
    }
}
