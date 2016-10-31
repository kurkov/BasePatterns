package com.github.kurkov.basepatterns.creational.builder.sample;

/**
 * @author Aleksey Kurkov. Created on 31.10.2016
 */
public class EnterpriseWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("Enterprise website");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
