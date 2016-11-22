package com.github.kurkov.basepatterns.behavioral.visitor.sample;

/**
 * @author Aleksey Kurkov. Created on 22.11.2016
 */
public class ProjectClass implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
