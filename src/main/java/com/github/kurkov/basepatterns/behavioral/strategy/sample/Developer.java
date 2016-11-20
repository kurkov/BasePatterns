package com.github.kurkov.basepatterns.behavioral.strategy.sample;

/**
 * @author Aleksey Kurkov. Created on 20.11.2016
 */
public class Developer {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity() {
        activity.justDoIt();
    }
}
