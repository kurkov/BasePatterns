package com.github.kurkov.basepatterns.creational.builder.sample1;

/**
 * @author Aleksey Kurkov. Created on 31.10.2016
 */
public class Website {
    private String name;
    private Cms cms;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setCms(Cms cms) {
        this.cms = cms;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Website{" +
                "name='" + name + '\'' +
                ", cms=" + cms +
                ", price=" + price +
                '}';
    }
}
