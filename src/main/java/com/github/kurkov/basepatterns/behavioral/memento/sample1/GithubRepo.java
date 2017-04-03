package com.github.kurkov.basepatterns.behavioral.memento.sample1;

/**
 * @author Aleksey Kurkov. Created on 18.11.2016
 */
public class GithubRepo {
    private Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}
