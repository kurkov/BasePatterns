package com.github.kurkov.basepatterns.structural.bridge.sample1;

/**
 * @author Aleksey Kurkov. Created on 03.11.2016
 */
public class BankSystem extends Program {

    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank System development in progress...");
        developer.writeCode();
    }
}
