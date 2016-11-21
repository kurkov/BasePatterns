package com.github.kurkov.basepatterns.behavioral.template.sample;

/**
 * @author Aleksey Kurkov. Created on 21.11.2016
 */
public abstract class WebsiteTemplate {
    public void showPage() {
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    public abstract void showPageContent();
}
