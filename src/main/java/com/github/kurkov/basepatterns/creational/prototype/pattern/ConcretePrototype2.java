package com.github.kurkov.basepatterns.creational.prototype.pattern;

/**
 * @author Aleksey Kurkov. Created on 31.10.2016
 */
public class ConcretePrototype2 implements Prototype {
    private int key;
    private String value;

    public ConcretePrototype2(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ConcretePrototype2{" +
                "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }

    @Override
    public Object clone() {
        ConcretePrototype2 copy = new ConcretePrototype2(key, value);
        return copy;
    }
}
