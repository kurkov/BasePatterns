package com.github.kurkov.basepatterns.behavioral.command.sample2;

/**
 * @author Aleksey Kurkov. Created on 22.03.2017
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
