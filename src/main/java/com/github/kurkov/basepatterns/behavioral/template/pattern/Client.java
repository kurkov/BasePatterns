package com.github.kurkov.basepatterns.behavioral.template.pattern;

/**
 * @author Aleksey Kurkov. Created on 21.11.2016
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass template = new ConcreteClass();

        template.templateMethod();
    }
}
