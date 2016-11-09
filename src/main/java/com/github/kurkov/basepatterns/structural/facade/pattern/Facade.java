package com.github.kurkov.basepatterns.structural.facade.pattern;

/**
 * @author Aleksey Kurkov. Created on 09.11.2016
 */
public class Facade {
    private SubSystemOne subSystemOne = new SubSystemOne();
    private SubSystemTwo subSystemTwo = new SubSystemTwo();
    private SubSystemThree subSystemThree = new SubSystemThree();

    public void startSystem() {
        subSystemOne.method1();

        subSystemTwo.method1();
        subSystemTwo.method2();

        subSystemThree.method1();
        subSystemThree.method2();
        subSystemThree.method3();
    }
}
