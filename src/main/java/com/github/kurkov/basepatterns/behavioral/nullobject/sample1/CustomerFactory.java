package com.github.kurkov.basepatterns.behavioral.nullobject.sample1;

/**
 * @author Aleksey Kurkov. Created on 04.05.2017
 */
public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name) {

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
