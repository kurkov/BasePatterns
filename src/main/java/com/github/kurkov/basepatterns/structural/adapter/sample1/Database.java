package com.github.kurkov.basepatterns.structural.adapter.sample1;

/**
 * @author Aleksey Kurkov. Created on 02.11.2016
 */
public interface Database {
    void create();

    void read();

    void update();

    void delete();
}
