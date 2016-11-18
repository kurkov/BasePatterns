package com.github.kurkov.basepatterns.behavioral.state.sample;

/**
 * @author Aleksey Kurkov. Created on 18.11.2016
 */
public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Sleeping...");
    }
}
