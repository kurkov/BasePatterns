package com.github.kurkov.basepatterns.behavioral.command.sample;

/**
 * @author Aleksey Kurkov. Created on 11.11.2016
 */
public class Database {
    public void insert() {
        System.out.println("Creating record...");
    }

    public void select() {
        System.out.println("Reading record...");
    }

    public void update() {
        System.out.println("Updating record...");
    }

    public void delete() {
        System.out.println("Deleting record...");
    }
}
