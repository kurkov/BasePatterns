package com.github.kurkov.basepatterns.structural.filter.sample1;

import java.util.List;

/**
 * @author Aleksey Kurkov. Created on 24.01.2017
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
