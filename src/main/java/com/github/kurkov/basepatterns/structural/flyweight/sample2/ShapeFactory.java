package com.github.kurkov.basepatterns.structural.flyweight.sample2;

import java.util.HashMap;

/**
 * @author Aleksey Kurkov. Created on 11.03.2017
 * @version 1.0
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
