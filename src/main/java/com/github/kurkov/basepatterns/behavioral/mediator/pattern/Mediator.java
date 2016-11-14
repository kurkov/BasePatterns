package com.github.kurkov.basepatterns.behavioral.mediator.pattern;

/**
 * @author Aleksey Kurkov. Created on 14.11.2016
 */
public interface Mediator {

    void addColleague(Colleague colleague);

    void update(Colleague colleague);

    void setData(String data);
}
