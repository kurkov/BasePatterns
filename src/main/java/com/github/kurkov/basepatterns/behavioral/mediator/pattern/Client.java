package com.github.kurkov.basepatterns.behavioral.mediator.pattern;

/**
 * @author Aleksey Kurkov. Created on 14.11.2016
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague colleague1 = new ConcreteColleague(1, "ConcreteColleague1 data", mediator);
        Colleague colleague2 = new ConcreteColleague(2, "ConcreteColleague2 data", mediator);

        mediator.addColleague(colleague1);
        mediator.addColleague(colleague2);

        System.out.println(mediator);

        colleague1.inform("ConcreteColleague1 changed data", mediator);
        mediator.update(colleague1);
        colleague2.inform("ConcreteColleague2 changed data", mediator);
        mediator.update(colleague2);

        System.out.println(mediator);
    }
}
