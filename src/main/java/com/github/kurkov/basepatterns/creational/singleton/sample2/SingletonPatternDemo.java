package com.github.kurkov.basepatterns.creational.singleton.sample2;

/**
 * @author Aleksey Kurkov. Created on 01.12.2016
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();
    }
}
