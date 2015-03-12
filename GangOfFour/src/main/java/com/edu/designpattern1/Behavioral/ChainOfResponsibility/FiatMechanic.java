package com.edu.designpattern.behavioral.chainofresponsibility;

import com.edu.common.exampleclasses.Car;

/**
 * Created by gustavokm90 on 1/28/15.
 */
public class FiatMechanic extends Mechanic{

    public FiatMechanic() {
        this.type = "Fiat";
    }

    @Override
    protected void fixCar(Car car){
        System.out.println(this.type+" Fixed!");
        car.drivingOnTheRoad();
    }
}
