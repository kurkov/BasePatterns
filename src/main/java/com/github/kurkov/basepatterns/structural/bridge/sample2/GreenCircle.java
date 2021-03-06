package com.github.kurkov.basepatterns.structural.bridge.sample2;

/**
 * @author Aleksey Kurkov. Created on 04.01.2017
 * @version 1.0
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle [color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
