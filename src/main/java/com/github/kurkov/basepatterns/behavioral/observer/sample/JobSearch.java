package com.github.kurkov.basepatterns.behavioral.observer.sample;

/**
 * @author Aleksey Kurkov. Created on 19.11.2016
 */
public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");

        Observer firstSubscriber = new Subscriber("Aleksey Kurkov");
        Observer secondSubscriber = new Subscriber("John Smith");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third Java Position");

        jobSite.removeVacancy("First Java Position");
    }
}
