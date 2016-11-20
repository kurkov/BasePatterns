package com.github.kurkov.basepatterns.behavioral.strategy.pattern;

/**
 * @author Aleksey Kurkov. Created on 20.11.2016
 */
public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.execute();
    }
}
