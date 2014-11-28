package com.edu.DesignPattern.Creational.LazyInitialization;

import com.edu.common.CustomExceptions.InvalidOperationException;
import com.edu.DesignPattern.Creational.AbstractFactory.Factories.VehicleFactory;
import com.edu.common.Products.Vehicle;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gustavokm90 on 11/6/14.
 */
public class LazyInitialization {

    final private static Map<String, Vehicle> objects = new HashMap<String, Vehicle>();

    public static Vehicle getLazyVehicle(String type) throws InvalidOperationException {
        Vehicle vehicle;
        if (!objects.containsKey(type)) {
            synchronized (objects) {
                if (!objects.containsKey(type)) {
                    vehicle = new VehicleFactory().createVehicle(type);
                    objects.put(type, vehicle);
                }
            }
        }
        return objects.get(type);
    }

    public static void showInstances(){
        if (objects.size()>0){
            System.out.println("Instances made : "+objects.size());
            for (Map.Entry<String,Vehicle> entry : objects.entrySet()){
                System.out.println(entry.getKey());
            }
        }
    }
}
