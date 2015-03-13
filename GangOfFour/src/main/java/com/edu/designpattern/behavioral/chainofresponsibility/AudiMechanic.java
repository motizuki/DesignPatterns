package com.edu.designpattern.behavioral.chainofresponsibility;

import com.edu.common.exampleclasses.concreteclasses.Car;

/**
 * Created by gustavokm90 on 1/28/15.
 */
public class AudiMechanic extends Mechanic{

    public AudiMechanic() {
        this.type = "Audi";
    }

    @Override
    protected void fixCar(Car car){
        System.out.println(this.type+" Fixed!");
        car.drivingOnTheRoad();
    }
}
