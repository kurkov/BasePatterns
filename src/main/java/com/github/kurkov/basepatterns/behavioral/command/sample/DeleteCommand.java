package com.github.kurkov.basepatterns.behavioral.command.sample;

/**
 * @author Aleksey Kurkov. Created on 11.11.2016
 */
public class DeleteCommand implements Command {
    private Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}
