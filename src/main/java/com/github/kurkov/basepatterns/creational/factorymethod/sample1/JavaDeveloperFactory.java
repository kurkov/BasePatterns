package com.github.kurkov.basepatterns.creational.factorymethod.sample1;

/**
 * @author Aleksey Kurkov. Created on 30.10.2016
 */
public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
