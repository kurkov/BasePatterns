package com.github.kurkov.basepatterns.behavioral.command.sample;

/**
 * @author Aleksey Kurkov. Created on 11.11.2016
 */
public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new Database();

        Developer developer = new Developer(
                new InsertCommand(database),
                new SelectCommand(database),
                new UpdateCommand(database),
                new DeleteCommand(database)
        );

        developer.insertRecord();
        developer.selectRecord();
        developer.updateRecord();
        developer.deleteRecord();
    }
}
