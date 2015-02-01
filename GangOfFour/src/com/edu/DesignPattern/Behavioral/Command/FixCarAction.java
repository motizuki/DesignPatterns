package com.edu.DesignPattern.Behavioral.Command;

import com.edu.DesignPattern.Behavioral.ChainOfResponsibility.AudiMechanic;
import com.edu.DesignPattern.Behavioral.ChainOfResponsibility.FiatMechanic;
import com.edu.DesignPattern.Behavioral.ChainOfResponsibility.Mechanic;
import com.edu.common.Products.Car;

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
