package com.github.kurkov.basepatterns.behavioral.nullobject.sample1;

/**
 * @author Aleksey Kurkov. Created on 04.05.2017
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
