package com.github.kurkov.basepatterns.structural.adapter.sample;

/**
 * @author Aleksey Kurkov. Created on 02.11.2016
 */
public class AdapterJavaToDatabase extends JavaApplication implements Database {
    @Override
    public void create() {
        createObject();
    }

    @Override
    public void read() {
        readObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void delete() {
        deleteObject();
    }
}
