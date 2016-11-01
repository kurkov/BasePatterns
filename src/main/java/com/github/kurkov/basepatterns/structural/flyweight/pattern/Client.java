package com.github.kurkov.basepatterns.structural.flyweight.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksey Kurkov. Created on 01.11.2016
 */
public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight flyweight1 = factory.getFlyweight("first");
        Flyweight flyweight2 = factory.getFlyweight("second");
        Flyweight flyweight3 = factory.getFlyweight("second");
        Flyweight flyweight4 = factory.getFlyweight("first");

        System.out.println(flyweight1);
        System.out.println(flyweight2);
        System.out.println(flyweight3);
        System.out.println(flyweight4);
    }
}
