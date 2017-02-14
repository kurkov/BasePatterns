package com.github.kurkov.basepatterns.structural.decorator.sample1;

/**
 * @author Aleksey Kurkov. Created on 05.11.2016
 */
public class JavaDeveloper implements Developer {
    @Override
    public String makeJob() {
        return "Write Java code. ";
    }
}
