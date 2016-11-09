package com.github.kurkov.basepatterns.structural.proxy.sample;

/**
 * @author Aleksey Kurkov. Created on 09.11.2016
 */
public class RealProject implements Project {
    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    private void load() {
        System.out.println("Loading project from " + url + "...");
    }

    @Override
    public void run() {
        System.out.println("Running project " + url + "...");
    }
}
