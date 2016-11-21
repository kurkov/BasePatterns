package com.github.kurkov.basepatterns.behavioral.template.sample;

/**
 * @author Aleksey Kurkov. Created on 21.11.2016
 */
public class WebsiteRunner {
    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();

        System.out.println("\n===============================\n");

        newsPage.showPage();
    }
}
