package com.github.kurkov.basepatterns.behavioral.command.sample2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksey Kurkov. Created on 22.03.2017
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {

        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
