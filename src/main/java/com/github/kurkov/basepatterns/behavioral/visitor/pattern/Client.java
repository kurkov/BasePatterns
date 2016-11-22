package com.github.kurkov.basepatterns.behavioral.visitor.pattern;

/**
 * @author Aleksey Kurkov. Created on 22.11.2016
 */
public class Client {
    public static void main(String[] args) {
        Visitor visitor = new ConcreteVisitor();

        ConcreteElementA elementA = new ConcreteElementA();
        ConcreteElementB elementB = new ConcreteElementB();

        visitor.visitElementA(elementA);
        visitor.visitElementB(elementB);
    }
}
