package com.edu.designpattern.behavioral.chainofresponsibility;

import com.edu.common.exampleclasses.concreteclasses.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gustavokm90 on 1/28/15.
 */
public class FiatMechanic extends Mechanic{

    private static final Logger logger = LoggerFactory.getLogger(FiatMechanic.class);
    public FiatMechanic() {
        this.type = "Fiat";
    }

    @Override
    protected void fixCar(Car car){
        logger.info(this.type+" Fixed!");
        car.drivingOnTheRoad();
    }
}
