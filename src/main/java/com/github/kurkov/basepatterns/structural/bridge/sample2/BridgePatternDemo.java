package com.github.kurkov.basepatterns.structural.bridge.sample2;

/**
 * @author Aleksey Kurkov. Created on 04.01.2017
 * @version 1.0
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
