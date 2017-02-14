package com.github.kurkov.basepatterns.structural.decorator.sample1;

/**
 * @author Aleksey Kurkov. Created on 05.11.2016
 */
public class SeniorJavaDeveloper extends DeveloperDecorator {

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return "Make code review. ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
