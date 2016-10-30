package com.github.kurkov.creational.abstractfactory.pattern;

/**
 * @author Aleksey Kurkov. Created on 30.10.2016
 */
public class Client {

    private AbstractFactory factory = new ConcreteFactory();
    private AbstractProduct productA = factory.createProductA();
    private AbstractProduct productB = factory.createProductB();

    AbstractProduct getProductA() {
        return productA;
    }

    AbstractProduct getProductB() {
        return productB;
    }

    public static void main(String[] args) {
        Client client = new Client();
        System.out.println(client.getProductA().toString());
        System.out.println(client.getProductB().toString());
    }
}
