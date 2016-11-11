package com.github.kurkov.basepatterns.behavioral.command.sample;

/**
 * @author Aleksey Kurkov. Created on 11.11.2016
 */
public class Developer {
    private Command insert;
    private Command select;
    private Command update;
    private Command delete;

    public Developer(Command insert, Command select, Command update, Command delete) {
        this.insert = insert;
        this.select = select;
        this.update = update;
        this.delete = delete;
    }

    public void insertRecord() {
        insert.execute();
    }

    public void selectRecord() {
        select.execute();
    }

    public void updateRecord() {
        update.execute();
    }

    public void deleteRecord() {
        delete.execute();
    }
}
