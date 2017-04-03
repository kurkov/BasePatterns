package com.github.kurkov.basepatterns.behavioral.mediator.sample2;

/**
 * @author Aleksey Kurkov. Created on 03.04.2017
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
