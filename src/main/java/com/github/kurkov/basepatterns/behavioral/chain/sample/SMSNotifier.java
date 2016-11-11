package com.github.kurkov.basepatterns.behavioral.chain.sample;

/**
 * @author Aleksey Kurkov. Created on 10.11.2016
 */
public class SMSNotifier extends Notifier {

    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending SMS to manager: " + message);
    }
}