package com.github.kurkov.basepatterns.behavioral.mediator.sample;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksey Kurkov. Created on 14.11.2016
 */
public class SimpleTextChat implements Chat {
    private User admin;
    private List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUserToChat(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            if (u != user) {
                u.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}
