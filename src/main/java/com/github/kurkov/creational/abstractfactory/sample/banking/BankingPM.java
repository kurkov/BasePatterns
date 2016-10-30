package com.github.kurkov.creational.abstractfactory.sample.banking;

import com.github.kurkov.creational.abstractfactory.sample.ProjectManager;

/**
 * @author Aleksey Kurkov. Created on 30.10.2016
 */
public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
