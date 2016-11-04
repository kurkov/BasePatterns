package com.github.kurkov.basepatterns.structural.composite.pattern;

/**
 * @author Aleksey Kurkov. Created on 04.11.2016
 */
public class Leaf implements Component {
    @Override
    public void operation() {
        System.out.println("Leaf performs operation...");
    }
}
