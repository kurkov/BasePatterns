package com.github.kurkov.basepatterns.creational.prototype.sample;

/**
 * @author Aleksey Kurkov. Created on 31.10.2016
 */
public class ProjectFactory {
    Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    Project cloneProject() {
        return (Project) project.copy();
    }
}
