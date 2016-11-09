package com.github.kurkov.basepatterns.structural.facade.sample;

/**
 * @author Aleksey Kurkov. Created on 09.11.2016
 */
public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) {
            System.out.println("Developer is solving problems...");
        } else {
            System.out.println("Developer is reading Habrahabr...");
        }
    }
}
