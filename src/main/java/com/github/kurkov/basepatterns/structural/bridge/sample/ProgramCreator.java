package com.github.kurkov.basepatterns.structural.bridge.sample;

/**
 * @author Aleksey Kurkov. Created on 03.11.2016
 */
public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        };

        for (Program program : programs) {
            program.developProgram();
        }
    }
}
