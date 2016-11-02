package com.github.kurkov.basepatterns.structural.adapter.sample;

/**
 * @author Aleksey Kurkov. Created on 02.11.2016
 */
public interface Database {
    void create();

    void read();

    void update();

    void delete();
}
