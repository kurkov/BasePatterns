package com.github.kurkov.basepatterns.creational.abstractfactory.sample1.website;

import com.github.kurkov.basepatterns.creational.abstractfactory.sample1.ProjectManager;

/**
 * @author Aleksey Kurkov. Created on 30.10.2016
 */
public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
