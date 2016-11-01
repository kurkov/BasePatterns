package com.github.kurkov.basepatterns.structural.flyweight.pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aleksey Kurkov. Created on 01.11.2016
 */
public class FlyweightFactory {
    private static final Map<String, Flyweight> FLYWEIGHT_MAP = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = FLYWEIGHT_MAP.get(key);

        if (flyweight == null) {
            flyweight = new ConcreteFlyweight();
            FLYWEIGHT_MAP.put(key, flyweight);
        }

        return flyweight;
    }
}
