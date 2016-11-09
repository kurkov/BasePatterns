package com.github.kurkov.basepatterns.structural.proxy.sample;

/**
 * @author Aleksey Kurkov. Created on 09.11.2016
 */
public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github.com/kurkov/BasePatterns");

        project.run();
    }
}
