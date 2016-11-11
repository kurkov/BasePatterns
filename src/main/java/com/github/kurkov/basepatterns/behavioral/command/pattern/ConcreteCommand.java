package com.github.kurkov.basepatterns.behavioral.command.pattern;

/**
 * @author Aleksey Kurkov. Created on 11.11.2016
 */
public class ConcreteCommand implements Command {
    Invoker invoker;

    public ConcreteCommand(Invoker invoker) {
        this.invoker = invoker;
    }

    @Override
    public void execute() {
        invoker.executeConcreteCommand();
    }
}
