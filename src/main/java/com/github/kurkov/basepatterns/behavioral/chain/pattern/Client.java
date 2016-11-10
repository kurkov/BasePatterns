package com.github.kurkov.basepatterns.behavioral.chain.pattern;

/**
 * @author Aleksey Kurkov. Created on 10.11.2016
 */
public class Client {
    public static void main(String[] args) {
        Handler concreteHandler1 = new ConcreteHandler1();
        Handler concreteHandler2 = new ConcreteHandler2();

        concreteHandler1.setNextHandler(concreteHandler2);

        concreteHandler1.handleRequest();
    }
}
