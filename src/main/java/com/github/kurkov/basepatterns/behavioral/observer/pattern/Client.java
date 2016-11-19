package com.github.kurkov.basepatterns.behavioral.observer.pattern;

/**
 * @author Aleksey Kurkov. Created on 19.11.2016
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject("On");
        Observer observer = new ConcreteObserver();

        subject.attach(observer);

        subject.changeState("Waiting");
        subject.changeState("Off");
    }
}
