package com.edu.DesignPattern.Structural.Flyweight;

import com.edu.DesignPattern.Structural.Adapter.VehicleClassAdapter;
import com.edu.common.Products.Car;
import com.edu.common.Products.Vehicle;

import java.util.HashMap;

/**
 * Created by gustavokm90 on 12/31/14.
 */
public class FlyweightVehiclePool {

    private static final HashMap<String, Vehicle> vehicleMap = new HashMap<String, Vehicle>();

    public static Vehicle getVehicle(String color, String type){

        Vehicle vehicle = vehicleMap.get(color);

        if (vehicle == null){
            vehicle = new VehicleClassAdapter(type);
            vehicleMap.put(color,vehicle);
            System.out.println("Creating Vehicle of type: "+type +" and color: "+color);
        }else{
            System.out.println("Using an existent vehicle object");
        }
        return vehicle;
    }
}
