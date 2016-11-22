package com.github.kurkov.basepatterns.behavioral.visitor.sample;

/**
 * @author Aleksey Kurkov. Created on 22.11.2016
 */
public interface Developer {
    void create(ProjectClass projectClass);

    void create(Database database);

    void create(Test test);
}
