package com.github.kurkov.basepatterns.behavioral.memento.pattern;

/**
 * @author Aleksey Kurkov. Created on 18.11.2016
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("on");
        System.out.printf("State is %s\n", originator.getState());
        caretaker.setMemento(originator.createMemento());

        originator.setState("off");
        System.out.printf("State is %s\n", originator.getState());

        originator.setMemento(caretaker.getMemento());
        System.out.printf("State is %s\n", originator.getState());
    }
}
