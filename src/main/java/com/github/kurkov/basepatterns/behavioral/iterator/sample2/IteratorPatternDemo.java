package com.github.kurkov.basepatterns.behavioral.iterator.sample2;

/**
 * @author Aleksey Kurkov. Created on 01.04.2017
 * @version 1.0
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iter = nameRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}
