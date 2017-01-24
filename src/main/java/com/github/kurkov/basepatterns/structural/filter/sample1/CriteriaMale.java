package com.github.kurkov.basepatterns.structural.filter.sample1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksey Kurkov. Created on 24.01.2017
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();

        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
