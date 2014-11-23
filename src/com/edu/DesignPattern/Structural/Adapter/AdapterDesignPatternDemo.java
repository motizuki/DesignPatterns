package com.edu.DesignPattern.Structural.Adapter;

import com.edu.common.Products.AdvancedVehicle;
import com.edu.common.Products.Car;
import com.edu.common.Products.Vehicle;

/**
 * Created by gustavokm90 on 11/21/14.
 */
public class AdapterDesignPatternDemo {

    public static void main (String[] args){

        Vehicle car = new Car();

        System.out.println("Car instance: " +car.price());
        System.out.println("Car instance: " +car.wheels());
        System.out.println("Car instance: " +car.turbo());

        //Testing a object related adaptor, adapting a AdvancedVehicle interface to Vehicle interface
        Vehicle advancedObjectCarAdapted = new VehicleObjectAdapter("advCar");

        System.out.println("Object adapter: " + advancedObjectCarAdapted.price());
        System.out.println("Object adapter: " + advancedObjectCarAdapted.wheels());
        System.out.println("Object adapter: " +advancedObjectCarAdapted.turbo());

        AdvancedVehicle advancedClassCar = new VehicleClassAdapter("advCar");

        System.out.println("Class advancedVehicle: " + advancedClassCar.turboPrice());
        System.out.println("Class advancedVehicle: " + advancedClassCar.turboWheels());
        System.out.println("Class advancedVehicle: " + advancedClassCar.turboBooster());

        Vehicle advancedClassCarAdapted = (Vehicle) advancedClassCar;

        System.out.println("Class adapter: " + advancedClassCarAdapted.price());
        System.out.println("Class adapter: " + advancedClassCarAdapted.wheels());
        System.out.println("Class adapter: " + advancedClassCarAdapted.turbo());


    }
}
