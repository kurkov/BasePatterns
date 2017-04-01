package com.github.kurkov.basepatterns.behavioral.iterator.sample1;

/**
 * @author Aleksey Kurkov. Created on 16.11.2016
 */
public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Maven", "PostgreSQL"};

        JavaDeveloper developer = new JavaDeveloper("Aleksey Kurkov", skills);

        Iterator iterator = developer.getIterator();
        System.out.println("Developer: " + developer.getName());
        System.out.print("Skills: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
