package com.edu.designpattern.structural.facade;

import com.edu.annotations.ApplicationService;
import com.edu.common.exampleclasses.*;
import com.edu.common.exampleclasses.concreteclasses.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gustavokm90 on 12/30/14.
 */
@ApplicationService
public class HybridVehicle {

    private static final Logger logger = LoggerFactory.getLogger(HybridVehicle.class);

    private Vehicle car;
    private Vehicle boat;
    private WhiteGoods oven;

    public HybridVehicle(Vehicle car, Vehicle boat, WhiteGoods oven){
        logger.info("Starting constructor HybridVehicle with set method");
        this.car = car;
        this.boat = boat;
        this.oven = oven;
    }

    public void driveOnTheSea(){
        logger.info(boat.specificAction());
    }
    public void driveOnTheRoad(){
        logger.info(car.specificAction() + ((Car)this.car).getBrand());
    }
    public void cook(){
        logger.info(oven.energyUsage());
    }

}
