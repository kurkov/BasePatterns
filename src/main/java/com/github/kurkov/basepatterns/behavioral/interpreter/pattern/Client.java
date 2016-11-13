package com.github.kurkov.basepatterns.behavioral.interpreter.pattern;

/**
 * @author Aleksey Kurkov. Created on 13.11.2016
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context("Java");
        AbstractExpression terminalExpression = getNonterminalExpression(context);

        System.out.println(terminalExpression.interpret(new Context("Java Developer")));
    }

    public static AbstractExpression getNonterminalExpression(Context context) {
        AbstractExpression expression = new TerminalExpression(context);

        return new NonterminalExpression(expression);
    }
}
