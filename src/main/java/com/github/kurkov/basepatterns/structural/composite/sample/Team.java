package com.github.kurkov.basepatterns.structural.composite.sample;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksey Kurkov. Created on 04.11.2016
 */
public class Team {
    List<Developer> developers = new ArrayList<>();

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void removeDeveloper(Developer developer) {
        developers.remove(developer);
    }

    public void createProject() {
        System.out.println("Team creates project...\n");
        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
