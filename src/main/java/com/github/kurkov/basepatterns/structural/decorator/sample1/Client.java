package com.github.kurkov.basepatterns.structural.decorator.sample1;

/**
 * @author Aleksey Kurkov. Created on 05.11.2016
 */
public class Client {
    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));

        System.out.println(developer.makeJob());
    }
}
