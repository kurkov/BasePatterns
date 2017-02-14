package com.github.kurkov.basepatterns.structural.decorator.sample1;

/**
 * @author Aleksey Kurkov. Created on 05.11.2016
 */
public class DeveloperDecorator implements Developer {

    Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
