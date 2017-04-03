package com.github.kurkov.basepatterns.behavioral.mediator.sample1;

/**
 * @author Aleksey Kurkov. Created on 14.11.2016
 */
public class Admin implements User {
    private Chat chat;
    private String name;

    public Admin(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name + " receiving message: " + message);
    }
}
