package com.github.kurkov.basepatterns.structural.proxy.pattern;

/**
 * @author Aleksey Kurkov. Created on 09.11.2016
 */
public class RealSubject implements Subject {
    public RealSubject() {
        System.out.println("Created RealSubject.");
    }

    @Override
    public void request() {
        System.out.println("RealProject is making request...");
    }
}
