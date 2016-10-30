package com.github.kurkov.creational.abstractfactory.sample;

/**
 * @author Aleksey Kurkov. Created on 30.10.2016
 */
public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
