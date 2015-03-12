package com.edu.designpattern.behavioral.command;

import com.edu.designpattern.behavioral.chainofresponsibility.AudiMechanic;
import com.edu.designpattern.behavioral.chainofresponsibility.FiatMechanic;
import com.edu.designpattern.behavioral.chainofresponsibility.Mechanic;
import com.edu.common.exampleclasses.Car;

/**
 * Created by gustavokm90 on 1/28/15.
 */
public class FixCarAction implements Action {

    private Car car;

    public FixCarAction(Car car) {
        this.car = car;
    }

    public void execute() {
        //Chain of responsibility design pattern
        Mechanic mechanic = (new AudiMechanic());
        mechanic.setSuccessor(new FiatMechanic());

        mechanic.handleRequest(this.car);
    }
}
