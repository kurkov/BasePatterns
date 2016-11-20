package com.github.kurkov.basepatterns.behavioral.strategy.sample;

/**
 * @author Aleksey Kurkov. Created on 20.11.2016
 */
public class Reading implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Reading...");
    }
}
