package com.github.kurkov.basepatterns.structural.composite.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksey Kurkov. Created on 04.11.2016
 */
public class Composite {
    private List<Component> componentList = new ArrayList<>();

    public void add(Component component) {
        componentList.add(component);
    }

    public void remove(Component component) {
        componentList.remove(component);
    }

    public Component getChild(int index) {
        return componentList.get(index);
    }
}
