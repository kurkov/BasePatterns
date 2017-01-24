package com.github.kurkov.basepatterns.structural.filter.sample1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksey Kurkov. Created on 24.01.2017
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();

        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
