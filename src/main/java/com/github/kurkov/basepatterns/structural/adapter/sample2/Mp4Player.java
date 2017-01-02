package com.github.kurkov.basepatterns.structural.adapter.sample2;

/**
 * @author Aleksey Kurkov. Created on 02.01.2017
 * @version 1.0
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
