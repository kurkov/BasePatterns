package com.github.kurkov.basepatterns.behavioral.command.sample1;

/**
 * @author Aleksey Kurkov. Created on 11.11.2016
 */
public class UpdateCommand implements Command {
    private Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
