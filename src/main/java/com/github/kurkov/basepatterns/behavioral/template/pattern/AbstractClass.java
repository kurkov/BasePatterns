package com.github.kurkov.basepatterns.behavioral.template.pattern;

/**
 * @author Aleksey Kurkov. Created on 21.11.2016
 */
public abstract class AbstractClass {
    public void templateMethod() {
        System.out.println("Template method");
        subMethod();
    }

    public abstract void subMethod();
}
