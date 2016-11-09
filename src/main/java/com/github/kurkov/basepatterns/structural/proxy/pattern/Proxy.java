package com.github.kurkov.basepatterns.structural.proxy.pattern;

/**
 * @author Aleksey Kurkov. Created on 09.11.2016
 */
public class Proxy implements Subject {
    private RealSubject realSubject;

    public Proxy() {
        System.out.println("Created Proxy.");
    }

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
