package com.github.kurkov.basepatterns.behavioral.visitor.pattern;

/**
 * @author Aleksey Kurkov. Created on 22.11.2016
 */
public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor v) {
        v.visitElementA(this);
    }
}
