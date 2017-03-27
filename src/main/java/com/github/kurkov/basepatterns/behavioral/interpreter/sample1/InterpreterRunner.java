package com.github.kurkov.basepatterns.behavioral.interpreter.sample1;

/**
 * @author Aleksey Kurkov. Created on 13.11.2016
 */
public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJavaDeveloper = getJavaExpression();
        Expression isJavaEEDeveloper = getJavaEEExpression();

        System.out.println("Does developer know Java Core: " + isJavaDeveloper.interpret("Java Core"));
        System.out.println("Does developer know Java EE: " + isJavaEEDeveloper.interpret("Java Spring"));
    }

    public static Expression getJavaExpression() {
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");

        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEEExpression() {
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");

        return new AndExpression(java, spring);
    }
}
