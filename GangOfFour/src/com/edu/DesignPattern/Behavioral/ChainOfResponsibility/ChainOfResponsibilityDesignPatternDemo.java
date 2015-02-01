package com.edu.DesignPattern.Behavioral.ChainOfResponsibility;

import com.edu.common.Products.Car;

/**
 * Created by gustavokm90 on 1/27/15.
 */
public class ChainOfResponsibilityDesignPatternDemo {

    public static void main(String[] args){

        //Create chain of classes
        Mechanic audiMechanic = new AudiMechanic();
        Mechanic fiatMechanic = new FiatMechanic();

        audiMechanic.setSuccessor(fiatMechanic);

        Mechanic chainMechanics = audiMechanic;

        Car fiat = new Car();
        fiat.setBrand("Fiat");

        Car audi = new Car();
        audi.setBrand("Audi");

        Car ford = new Car();
        ford.setBrand("Ford");

        chainMechanics.handleRequest(fiat);
        chainMechanics.handleRequest(audi);
        chainMechanics.handleRequest(ford);


    }
}
