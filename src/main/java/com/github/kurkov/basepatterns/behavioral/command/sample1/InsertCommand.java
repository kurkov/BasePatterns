package com.github.kurkov.basepatterns.behavioral.command.sample1;

/**
 * @author Aleksey Kurkov. Created on 11.11.2016
 */
public class InsertCommand implements Command {
    private Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }
}
