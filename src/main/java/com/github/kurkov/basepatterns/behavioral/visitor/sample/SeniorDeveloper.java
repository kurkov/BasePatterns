package com.github.kurkov.basepatterns.behavioral.visitor.sample;

/**
 * @author Aleksey Kurkov. Created on 22.11.2016
 */
public class SeniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewriting class after junior...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Fixing database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Writing reliable test...");
    }
}
