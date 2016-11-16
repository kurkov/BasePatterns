package com.github.kurkov.basepatterns.behavioral.iterator.pattern;

/**
 * @author Aleksey Kurkov. Created on 16.11.2016
 */
public class Client {
    public static void main(String[] args) {
        Context[] context = {new Context("Context1"), new Context("Context2")};

        ConcreteAggregate concreteAggregate = new ConcreteAggregate(context);

        Iterator iterator = concreteAggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
