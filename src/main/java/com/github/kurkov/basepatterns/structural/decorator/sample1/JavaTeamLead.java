package com.github.kurkov.basepatterns.structural.decorator.sample1;

/**
 * @author Aleksey Kurkov. Created on 05.11.2016
 */
public class JavaTeamLead extends DeveloperDecorator {

    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport() {
        return "Send week report to customer. ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }
}
