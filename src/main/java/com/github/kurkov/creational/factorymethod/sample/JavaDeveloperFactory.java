package com.github.kurkov.creational.factorymethod.sample;

/**
 * @author Aleksey Kurkov. Created on 30.10.2016
 */
public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
