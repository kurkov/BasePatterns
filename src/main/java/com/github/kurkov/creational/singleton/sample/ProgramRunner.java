package com.github.kurkov.creational.singleton.sample;

/**
 * @author Aleksey Kurkov. Created on 30.10.2016
 */
public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("First log...");
        ProgramLogger.getProgramLogger().addLogInfo("Second log...");
        ProgramLogger.getProgramLogger().addLogInfo("Third log...");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}
