package com.github.kurkov.basepatterns.behavioral.iterator.pattern;

/**
 * @author Aleksey Kurkov. Created on 16.11.2016
 */
public class Context {
    private String objectField;

    public Context(String objectField) {
        this.objectField = objectField;
    }

    public String getObjectField() {
        return objectField;
    }

    public void setObjectField(String objectField) {
        this.objectField = objectField;
    }

    @Override
    public String toString() {
        return "Context{" +
                "objectField='" + objectField + '\'' +
                '}';
    }
}
