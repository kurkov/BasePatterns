package com.github.kurkov.basepatterns.structural.facade.pattern;

/**
 * @author Aleksey Kurkov. Created on 09.11.2016
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.startSystem();
    }
}
