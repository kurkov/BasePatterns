package com.github.kurkov.basepatterns.behavioral.chain.sample;

/**
 * @author Aleksey Kurkov. Created on 10.11.2016
 */
public class SimpleReportNotifier extends Notifier {

    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifying using simple report: " + message);
    }
}
