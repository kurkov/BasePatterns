package com.github.kurkov.basepatterns.structural.adapter.pattern;

/**
 * @author Aleksey Kurkov. Created on 02.11.2016
 */
public class ConcreteAdapter extends Adaptee implements Adapter {
    @Override
    public void operation() {
        adaptedOperation();
    }
}
