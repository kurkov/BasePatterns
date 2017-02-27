package com.github.kurkov.basepatterns.structural.facade.sample1;

/**
 * @author Aleksey Kurkov. Created on 09.11.2016
 */
public class Workflow {
    private Developer developer = new Developer();
    private Job job = new Job();
    private BugTracker bugTracker = new BugTracker();

    public void solveProblems() {
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }
}
