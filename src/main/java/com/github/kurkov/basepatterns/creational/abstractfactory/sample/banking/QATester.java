package com.github.kurkov.basepatterns.creational.abstractfactory.sample.banking;

import com.github.kurkov.basepatterns.creational.abstractfactory.sample.Tester;

/**
 * @author Aleksey Kurkov. Created on 30.10.2016
 */
public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QATester tests banking code...");
    }
}
