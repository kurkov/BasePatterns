package com.github.kurkov.basepatterns.structural.proxy.sample2;

/**
 * @author Aleksey Kurkov. Created on 19.03.2017
 * @version 1.0
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
