package com.github.kurkov.basepatterns.behavioral.command.sample2;

/**
 * @author Aleksey Kurkov. Created on 22.03.2017
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
