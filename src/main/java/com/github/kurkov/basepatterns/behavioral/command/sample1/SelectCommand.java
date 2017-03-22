package com.github.kurkov.basepatterns.behavioral.command.sample1;

/**
 * @author Aleksey Kurkov. Created on 11.11.2016
 */
public class SelectCommand implements Command {
    private Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}
