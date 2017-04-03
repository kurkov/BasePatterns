package com.github.kurkov.basepatterns.behavioral.mediator.sample2;

import java.util.Date;

/**
 * @author Aleksey Kurkov. Created on 03.04.2017
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
