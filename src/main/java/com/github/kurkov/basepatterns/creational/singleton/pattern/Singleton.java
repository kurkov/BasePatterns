package com.github.kurkov.basepatterns.creational.singleton.pattern;

/**
 * @author Aleksey Kurkov. Created on 30.10.2016
 */
public class Singleton {
    private static Singleton uniqueInstance;
    private String singletonData = "Singleton data";

    public static synchronized Singleton instance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }

        return uniqueInstance;
    }

    private Singleton() {

    }

    public String singletonOperation() {
        return singletonData;
    }
}
