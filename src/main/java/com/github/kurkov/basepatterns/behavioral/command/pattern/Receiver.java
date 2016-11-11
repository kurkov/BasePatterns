package com.github.kurkov.basepatterns.behavioral.command.pattern;

/**
 * @author Aleksey Kurkov. Created on 11.11.2016
 */
public class Receiver {
    private Command command;

    public Receiver(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
