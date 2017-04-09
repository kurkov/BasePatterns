package com.github.kurkov.basepatterns.behavioral.state.sample1;

/**
 * @author Aleksey Kurkov. Created on 18.11.2016
 */
public class DeveloperDay {
    public static void main(String[] args) {
        Developer developer = new Developer();
        Activity activity = new Sleeping();

        developer.setActivity(activity);

        for (int i = 0; i < 10; i++) {
            developer.justDoIt();
            developer.changeActivity();
        }
    }
}
