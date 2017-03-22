package com.github.kurkov.basepatterns.behavioral.command.sample2;

/**
 * @author Aleksey Kurkov. Created on 22.03.2017
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name +
                ", Quantity: " + quantity + " ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name +
                ", Quantity: " + quantity + " ] sold");
    }
}
