package com.github.kurkov.basepatterns.structural.proxy.sample;

/**
 * @author Aleksey Kurkov. Created on 09.11.2016
 */
public class ProxyProject implements Project {
    private String url;
    private RealProject realProject;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if (realProject == null) {
            realProject = new RealProject(url);
        }
        realProject.run();
    }
}
