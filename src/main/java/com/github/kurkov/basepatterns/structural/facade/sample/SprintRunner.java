package com.github.kurkov.basepatterns.structural.facade.sample;

/**
 * @author Aleksey Kurkov. Created on 09.11.2016
 */
public class SprintRunner {
    public static void main(String[] args) {
        /*Job job = new Job();
        job.doJob();
        BugTracker bugTracker = new BugTracker();
        bugTracker.startSprint();
        Developer developer = new Developer();
        developer.doJobBeforeDeadline(bugTracker);
        bugTracker.finishSprint();
        developer.doJobBeforeDeadline(bugTracker);*/

        Workflow workflow = new Workflow();
        workflow.solveProblems();
    }
}
