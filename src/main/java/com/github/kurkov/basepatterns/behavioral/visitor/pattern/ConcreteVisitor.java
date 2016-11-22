package com.github.kurkov.basepatterns.behavioral.visitor.pattern;

/**
 * @author Aleksey Kurkov. Created on 22.11.2016
 */
public class ConcreteVisitor implements Visitor {
    @Override
    public void visitElementA(ConcreteElementA a) {
        System.out.println("Visiting concrete element A");
    }

    @Override
    public void visitElementB(ConcreteElementB b) {
        System.out.println("Visiting concrete element B");
    }
}
