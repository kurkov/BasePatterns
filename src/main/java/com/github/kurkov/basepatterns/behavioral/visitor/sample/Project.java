package com.github.kurkov.basepatterns.behavioral.visitor.sample;

/**
 * @author Aleksey Kurkov. Created on 22.11.2016
 */
public class Project implements ProjectElement {
    ProjectElement[] projectElements;

    public Project() {
        this.projectElements = new ProjectElement[]{
                new ProjectClass(),
                new Database(),
                new Test()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for (ProjectElement element : projectElements) {
            element.beWritten(developer);
        }
    }
}
