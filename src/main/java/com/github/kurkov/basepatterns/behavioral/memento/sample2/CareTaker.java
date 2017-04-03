package com.github.kurkov.basepatterns.behavioral.memento.sample2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksey Kurkov. Created on 03.04.2017
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
