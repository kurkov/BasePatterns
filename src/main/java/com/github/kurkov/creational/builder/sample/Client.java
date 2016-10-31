package com.github.kurkov.creational.builder.sample;

/**
 * @author Aleksey Kurkov. Created on 31.10.2016
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new EnterpriseWebsiteBuilder());
        Website website = director.buildWebsite();

        System.out.println(website);
    }
}
