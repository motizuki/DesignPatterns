package com.edu.designpattern.structural.adapter;

import com.edu.common.exampleclasses.AdvancedVehicle;
import com.edu.common.exampleclasses.concreteclasses.Car;
import com.edu.common.exampleclasses.Vehicle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gustavokm90 on 11/21/14.
 */
 public class AdapterDesignPatternDemo {
    private static final Logger logger = LoggerFactory.getLogger(AdapterDesignPatternDemo.class);


    static public void main (String... x){

        Vehicle car = new Car();

        logger.info("Car instance: " +car.price());
        logger.info("Car instance: " +car.wheels());
        logger.info("Car instance: " +car.turbo());

        //Testing a object related adaptor, adapting a AdvancedVehicle interface to Vehicle interface
        Vehicle advancedObjectCarAdapted = new VehicleObjectAdapter("advCar");

        logger.info("Object adapter: " + advancedObjectCarAdapted.price());
        logger.info("Object adapter: " + advancedObjectCarAdapted.wheels());
        logger.info("Object adapter: " +advancedObjectCarAdapted.turbo());

        AdvancedVehicle advancedClassCar = new VehicleClassAdapter("advCar");

        logger.info("Class advancedVehicle: " + advancedClassCar.turboPrice());
        logger.info("Class advancedVehicle: " + advancedClassCar.turboWheels());
        logger.info("Class advancedVehicle: " + advancedClassCar.turboBooster());

        Vehicle advancedClassCarAdapted = (Vehicle) advancedClassCar;

        logger.info("Class adapter: " + advancedClassCarAdapted.price());
        logger.info("Class adapter: " + advancedClassCarAdapted.wheels());
        logger.info("Class adapter: " + advancedClassCarAdapted.turbo());


    }
}
