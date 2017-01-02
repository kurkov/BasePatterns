package com.github.kurkov.basepatterns.structural.adapter.sample1;

/**
 * @author Aleksey Kurkov. Created on 02.11.2016
 */
public class DatabaseRunner {
    static Database database;

    public static void main(String[] args) {
        database = new AdapterJavaToDatabase();

        database.create();
        database.read();
        database.update();
        database.delete();
    }
}
