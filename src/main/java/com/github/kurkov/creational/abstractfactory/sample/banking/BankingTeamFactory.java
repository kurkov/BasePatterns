package com.github.kurkov.creational.abstractfactory.sample.banking;

import com.github.kurkov.creational.abstractfactory.sample.Developer;
import com.github.kurkov.creational.abstractfactory.sample.ProjectManager;
import com.github.kurkov.creational.abstractfactory.sample.ProjectTeamFactory;
import com.github.kurkov.creational.abstractfactory.sample.Tester;

/**
 * @author Aleksey Kurkov. Created on 30.10.2016
 */
public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
