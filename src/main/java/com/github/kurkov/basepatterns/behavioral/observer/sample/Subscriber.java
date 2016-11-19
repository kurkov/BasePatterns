package com.github.kurkov.basepatterns.behavioral.observer.sample;

import java.util.List;

/**
 * @author Aleksey Kurkov. Created on 19.11.2016
 */
public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + "\nWe have some changes in vacancies:\n" + vacancies +
                "\n==================================================\n");
    }
}
