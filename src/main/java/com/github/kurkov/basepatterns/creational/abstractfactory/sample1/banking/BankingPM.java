package com.github.kurkov.basepatterns.creational.abstractfactory.sample1.banking;

import com.github.kurkov.basepatterns.creational.abstractfactory.sample1.ProjectManager;

/**
 * @author Aleksey Kurkov. Created on 30.10.2016
 */
public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
