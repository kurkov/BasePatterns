package com.github.kurkov.basepatterns.structural.bridge.sample2;

/**
 * @author Aleksey Kurkov. Created on 04.01.2017
 * @version 1.0
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
