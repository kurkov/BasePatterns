package com.github.kurkov.basepatterns.creational.abstractfactory.sample;

import com.github.kurkov.basepatterns.creational.abstractfactory.sample.banking.BankingTeamFactory;

/**
 * @author Aleksey Kurkov. Created on 30.10.2016
 */
public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory factory = new BankingTeamFactory();
        Developer developer = factory.getDeveloper();
        Tester tester = factory.getTester();
        ProjectManager projectManager = factory.getProjectManager();

        System.out.println("Creating bank system...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
