package com.github.kurkov.creational.builder.sample;

/**
 * @author Aleksey Kurkov. Created on 31.10.2016
 */
public abstract class WebsiteBuilder {
    Website website;

    void createWebsite() {
        website = new Website();
    }

    abstract void buildName();

    abstract void buildCms();

    abstract void buildPrice();

    public Website getWebsite() {
        return website;
    }
}
