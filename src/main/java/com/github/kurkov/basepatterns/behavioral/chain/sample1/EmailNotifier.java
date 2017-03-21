package com.github.kurkov.basepatterns.behavioral.chain.sample1;

/**
 * @author Aleksey Kurkov. Created on 10.11.2016
 */
public class EmailNotifier extends Notifier {

    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending email: " + message);
    }
}
