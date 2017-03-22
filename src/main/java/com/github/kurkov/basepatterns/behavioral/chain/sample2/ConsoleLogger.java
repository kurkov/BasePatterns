package com.github.kurkov.basepatterns.behavioral.chain.sample2;

/**
 * @author Aleksey Kurkov. Created on 21.03.2017
 * @version 1.0
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
