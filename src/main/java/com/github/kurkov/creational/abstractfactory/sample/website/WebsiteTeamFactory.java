package com.github.kurkov.creational.abstractfactory.sample.website;

import com.github.kurkov.creational.abstractfactory.sample.Developer;
import com.github.kurkov.creational.abstractfactory.sample.ProjectManager;
import com.github.kurkov.creational.abstractfactory.sample.ProjectTeamFactory;
import com.github.kurkov.creational.abstractfactory.sample.Tester;

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
