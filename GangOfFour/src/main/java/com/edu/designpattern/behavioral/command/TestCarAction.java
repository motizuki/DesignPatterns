package com.edu.designpattern.behavioral.command;

import com.edu.common.exampleclasses.concreteclasses.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gustavokm90 on 1/28/15.
 */
public class TestCarAction implements Action {

    private static final Logger logger = LoggerFactory.getLogger(TestCarAction.class);

    private Car car;

    public TestCarAction(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        logger.info(this.car.drivingOnTheRoad());
    }
}
