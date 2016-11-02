package com.github.kurkov.basepatterns.structural.adapter.pattern;

/**
 * @author Aleksey Kurkov. Created on 02.11.2016
 */
public class Client {
    private static Adapter adapter;

    public static void main(String[] args) {
        adapter = new ConcreteAdapter();

        adapter.operation();
    }
}
