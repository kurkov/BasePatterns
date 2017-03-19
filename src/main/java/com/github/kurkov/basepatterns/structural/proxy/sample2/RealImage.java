package com.github.kurkov.basepatterns.structural.proxy.sample2;

/**
 * @author Aleksey Kurkov. Created on 19.03.2017
 * @version 1.0
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
}
