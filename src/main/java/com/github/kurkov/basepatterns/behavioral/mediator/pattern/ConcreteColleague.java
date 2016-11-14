package com.github.kurkov.basepatterns.behavioral.mediator.pattern;

/**
 * @author Aleksey Kurkov. Created on 14.11.2016
 */
public class ConcreteColleague implements Colleague {
    private int id;
    private String data;
    private Mediator mediator;

    public ConcreteColleague(int id, String data, Mediator mediator) {
        this.id = id;
        this.data = data;
        this.mediator = mediator;
    }

    @Override
    public void inform(String message, Mediator mediator) {
        mediator.setData(message);
    }

    @Override
    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ConcreteColleague{" +
                "id=" + id +
                ", data='" + data + '\'' +
                '}';
    }
}
