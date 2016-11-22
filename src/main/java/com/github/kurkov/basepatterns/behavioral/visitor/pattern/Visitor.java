package com.github.kurkov.basepatterns.behavioral.visitor.pattern;

/**
 * @author Aleksey Kurkov. Created on 22.11.2016
 */
public interface Visitor {
    void visitElementA(ConcreteElementA a);

    void visitElementB(ConcreteElementB b);
}
