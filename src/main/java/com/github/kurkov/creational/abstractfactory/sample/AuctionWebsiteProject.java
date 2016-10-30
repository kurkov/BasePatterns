package com.github.kurkov.creational.abstractfactory.sample;

import com.github.kurkov.creational.abstractfactory.sample.website.WebsiteTeamFactory;

/**
 * @author Aleksey Kurkov. Created on 30.10.2016
 */
public class AuctionWebsiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory factory = new WebsiteTeamFactory();
        Developer developer = factory.getDeveloper();
        Tester tester = factory.getTester();
        ProjectManager projectManager = factory.getProjectManager();

        System.out.println("Creating auction website...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
