package com.github.kurkov.basepatterns.structural.bridge.sample;

/**
 * @author Aleksey Kurkov. Created on 03.11.2016
 */
public class StockExchange extends Program {

    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock Exchange development in progress...");
        developer.writeCode();
    }
}
