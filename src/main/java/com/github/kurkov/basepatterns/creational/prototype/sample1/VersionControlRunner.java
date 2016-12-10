package com.github.kurkov.basepatterns.creational.prototype.sample1;

/**
 * @author Aleksey Kurkov. Created on 31.10.2016
 */
public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject", "SourceCode sourceCode = new SourceCode();");

        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();
        System.out.println("======================");
        System.out.println(masterClone);
    }
}
