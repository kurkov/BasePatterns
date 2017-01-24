package com.github.kurkov.basepatterns.structural.filter.sample1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksey Kurkov. Created on 24.01.2017
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();

        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
