package com.github.kurkov.basepatterns.creational.factorymethod.sample;

/**
 * @author Aleksey Kurkov. Created on 30.10.2016
 */
public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
