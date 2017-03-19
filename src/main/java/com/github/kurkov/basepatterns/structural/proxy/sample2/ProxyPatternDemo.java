package com.github.kurkov.basepatterns.structural.proxy.sample2;

/**
 * @author Aleksey Kurkov. Created on 19.03.2017
 * @version 1.0
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}
