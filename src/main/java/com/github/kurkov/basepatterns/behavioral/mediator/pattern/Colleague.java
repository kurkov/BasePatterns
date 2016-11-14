package com.github.kurkov.basepatterns.behavioral.mediator.pattern;

/**
 * @author Aleksey Kurkov. Created on 14.11.2016
 */
public interface Colleague {

    void inform(String message, Mediator mediator);

    void setData(String data);
}
