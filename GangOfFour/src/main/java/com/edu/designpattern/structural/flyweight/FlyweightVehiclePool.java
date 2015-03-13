package com.edu.designpattern.structural.flyweight;

import com.edu.designpattern.structural.adapter.VehicleClassAdapter;
import com.edu.common.exampleclasses.Vehicle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

/**
 * Created by gustavokm90 on 12/31/14.
 */
public class FlyweightVehiclePool {

    private static final Logger logger = LoggerFactory.getLogger(FlyweightVehiclePool.class);


    private static final HashMap<String, Vehicle> vehicleMap = new HashMap<String, Vehicle>();

    public static Vehicle getVehicle(String color, String type){

        Vehicle vehicle = vehicleMap.get(color);

        if (vehicle == null){
            vehicle = new VehicleClassAdapter(type);
            vehicleMap.put(color,vehicle);
            logger.info("Creating Vehicle of type: "+type +" and color: "+color);
        }else{
            logger.info("Using an existent vehicle object");
        }
        return vehicle;
    }
}
