package com.github.kurkov.basepatterns.behavioral.mediator.sample2;

/**
 * @author Aleksey Kurkov. Created on 03.04.2017
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
