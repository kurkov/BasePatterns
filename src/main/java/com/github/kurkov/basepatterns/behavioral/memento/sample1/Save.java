package com.github.kurkov.basepatterns.behavioral.memento.sample1;

import java.util.Date;

/**
 * @author Aleksey Kurkov. Created on 18.11.2016
 */
public class Save {
    private final String version;
    private final Date date;

    public Save(String version) {
        this.version = version;
        this.date = new Date();
    }

    public String getVersion() {
        return version;
    }

    public Date getDate() {
        return date;
    }
}
