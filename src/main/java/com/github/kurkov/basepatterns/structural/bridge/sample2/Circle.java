package com.github.kurkov.basepatterns.structural.bridge.sample2;

/**
 * @author Aleksey Kurkov. Created on 04.01.2017
 * @version 1.0
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
