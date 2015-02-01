package com.edu.DesignPattern.Behavioral.Mediator;


/**
 * Created by gustavokm90 on 1/30/15.
 */
public class MediatorDesignPatternDemo {
    public static void main(String[] args) {

        Colleague colleague = new ConcreteColleague();

        System.out.println("Starting a request from a Colleague...");
        colleague.sendTransformationRequest();
    }
}
