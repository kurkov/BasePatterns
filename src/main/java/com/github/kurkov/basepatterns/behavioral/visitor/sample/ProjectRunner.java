package com.github.kurkov.basepatterns.behavioral.visitor.sample;

/**
 * @author Aleksey Kurkov. Created on 22.11.2016
 */
public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();

        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("Junior in Action...");
        project.beWritten(junior);

        System.out.println("\n============================\n");

        System.out.println("Senior in Action...");
        project.beWritten(senior);
    }
}
