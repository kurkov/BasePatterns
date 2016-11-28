package com.github.kurkov.basepatterns.creational.abstractfactory.sample1.website;

import com.github.kurkov.basepatterns.creational.abstractfactory.sample1.Developer;
import com.github.kurkov.basepatterns.creational.abstractfactory.sample1.ProjectManager;
import com.github.kurkov.basepatterns.creational.abstractfactory.sample1.ProjectTeamFactory;
import com.github.kurkov.basepatterns.creational.abstractfactory.sample1.Tester;

/**
 * @author Aleksey Kurkov. Created on 30.10.2016
 */
public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
