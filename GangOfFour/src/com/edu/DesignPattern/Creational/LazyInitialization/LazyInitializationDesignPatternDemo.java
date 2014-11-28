package com.edu.DesignPattern.Creational.LazyInitialization;

import com.edu.common.CustomExceptions.InvalidOperationException;
import com.edu.common.Products.Boat;
import com.edu.common.Products.Car;

/**
 * Created by gustavokm90 on 11/6/14.
 */
public class LazyInitializationDesignPatternDemo {
    public static void main (String[] args){

        try {
            Car car = (Car) LazyInitialization.getLazyVehicle("Car");
            LazyInitialization.showInstances();
            Boat boat = (Boat) LazyInitialization.getLazyVehicle("Boat");
            LazyInitialization.showInstances();
            Car car2 = (Car)  LazyInitialization.getLazyVehicle("Car");
            LazyInitialization.showInstances();

            car.setPrice(10);
            car.drivingInTheRoad();
            System.out.println(car.getPrice());

            car2.setPrice(90);
            car2.drivingInTheRoad();
            System.out.println(car2.getPrice());

            System.out.println("Instance 1");
            System.out.println(car.getPrice());




        } catch (InvalidOperationException e) {
            e.printStackTrace();
        }


    }
}
