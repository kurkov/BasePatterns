package com.github.kurkov.basepatterns.structural.adapter.sample2;

/**
 * @author Aleksey Kurkov. Created on 02.01.2017
 * @version 1.0
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}
