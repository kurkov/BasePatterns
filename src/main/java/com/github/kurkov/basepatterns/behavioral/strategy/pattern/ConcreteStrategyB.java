package com.github.kurkov.basepatterns.behavioral.strategy.pattern;

/**
 * @author Aleksey Kurkov. Created on 20.11.2016
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void execute() {
        System.out.println("Executing concrete strategy B...");
    }
}
