package com.github.kurkov.basepatterns.structural.flyweight.sample;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aleksey Kurkov. Created on 01.11.2016
 */
public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpeciality(String speciality) {
        Developer developer = developers.get(speciality);

        if (developer == null) {
            switch (speciality) {
                case "java":
                    System.out.println("Hiring Java developer...");
                    developer = new JavaDeveloper();
                    break;
                case "php":
                    System.out.println("Hiring PHP developer...");
                    developer = new PhpDeveloper();
            }
            developers.put(speciality, developer);
        }

        return developer;
    }
}
