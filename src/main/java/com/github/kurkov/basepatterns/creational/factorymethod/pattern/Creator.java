package com.github.kurkov.basepatterns.creational.factorymethod.pattern;

/**
 * @author Aleksey Kurkov. Created on 30.10.2016
 */
public class Creator {

    Product product;

    public Product factoryMethod() {
        return null;
    }

    public void anOperation() {
        product = factoryMethod();
    }
}
