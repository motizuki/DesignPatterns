package com.edu.designpattern.behavioral.command;

import com.edu.common.exampleclasses.Car;

/**
 * Created by gustavokm90 on 1/28/15.
 */
public class TestCarAction implements Action {

    private Car car;

    public TestCarAction(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        System.out.println(this.car.drivingOnTheRoad());
    }
}
