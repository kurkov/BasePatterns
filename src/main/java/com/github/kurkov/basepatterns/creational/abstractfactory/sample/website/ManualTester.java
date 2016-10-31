package com.github.kurkov.basepatterns.creational.abstractfactory.sample.website;

import com.github.kurkov.basepatterns.creational.abstractfactory.sample.Tester;

/**
 * @author Aleksey Kurkov. Created on 30.10.2016
 */
public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website...");
    }
}
