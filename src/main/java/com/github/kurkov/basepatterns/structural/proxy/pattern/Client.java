package com.github.kurkov.basepatterns.structural.proxy.pattern;

/**
 * @author Aleksey Kurkov. Created on 09.11.2016
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new Proxy();

        subject.request();
    }
}
