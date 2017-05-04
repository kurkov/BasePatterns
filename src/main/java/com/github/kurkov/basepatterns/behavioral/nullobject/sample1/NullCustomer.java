package com.github.kurkov.basepatterns.behavioral.nullobject.sample1;

/**
 * @author Aleksey Kurkov. Created on 04.05.2017
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
