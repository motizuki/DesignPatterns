package com.edu.designpattern.behavioral.command;

import com.edu.common.exampleclasses.concreteclasses.Car;

/**
 * Created by gustavokm90 on 1/28/15.
 */
public class CommandDesignPatternDemo {

    public static void main(String[] args) {

        Garage garage = new Garage();
        Car car = new Car();
        car.setBrand("Audi");

        FixCarAction fixCarAction = new FixCarAction(car);
        TestCarAction testCarAction = new TestCarAction(car);

        garage.takeActions(fixCarAction);
        garage.takeActions(testCarAction);

        garage.performActions();
    }
}
