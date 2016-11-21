package com.github.kurkov.basepatterns.behavioral.template.sample;

/**
 * @author Aleksey Kurkov. Created on 21.11.2016
 */
public class WelcomePage extends WebsiteTemplate {
    @Override
    public void showPageContent() {
        System.out.println("Welcome");
    }
}
