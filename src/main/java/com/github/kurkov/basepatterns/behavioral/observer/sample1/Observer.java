package com.github.kurkov.basepatterns.behavioral.observer.sample1;

import java.util.List;

/**
 * @author Aleksey Kurkov. Created on 19.11.2016
 */
public interface Observer {
    void handleEvent(List<String> vacancies);
}
