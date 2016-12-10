package com.github.kurkov.basepatterns.creational.builder.sample1;

/**
 * @author Aleksey Kurkov. Created on 31.10.2016
 */
public class VisitCardWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("Visit card");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }
}
