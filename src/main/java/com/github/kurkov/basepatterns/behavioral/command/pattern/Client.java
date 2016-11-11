package com.github.kurkov.basepatterns.behavioral.command.pattern;

/**
 * @author Aleksey Kurkov. Created on 11.11.2016
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        Receiver receiver = new Receiver(new ConcreteCommand(invoker));
        receiver.action();
    }
}
