package com.github.kurkov.basepatterns.behavioral.memento.sample;

import java.util.Date;

/**
 * @author Aleksey Kurkov. Created on 18.11.2016
 */
public class Project {
    private String version;
    private Date date;

    public void setVersionAndDate(String version) {
        this.version = version;
        this.date = new Date();
    }

    public Save save() {
        return new Save(version);
    }

    public void load(Save save) {
        version = save.getVersion();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return "Project:" +
                "\nVersion='" + version +
                "\nDate: " + date + "\n";
    }
}
