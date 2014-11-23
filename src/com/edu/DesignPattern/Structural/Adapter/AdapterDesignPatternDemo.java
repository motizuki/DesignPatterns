package com.edu.DesignPattern.Structural.Adapter;

import com.edu.common.Products.AdvancedVehicle;
import com.edu.common.Products.Car;
import com.edu.common.Products.Vehicle;

/**
 * Created by gustavokm90 on 11/21/14.
 */
public class AdapterDesignPatternDemo {

    public static void main (String[] args){

        //Testing a object related adaptor
        Vehicle advancedCar = new ObjectAdapter("advCar");

        System.out.println(advancedCar.price());
        System.out.println(advancedCar.wheels());
        System.out.println(advancedCar.turbo());

        Vehicle car = new Car();

        System.out.println(car.price());
        System.out.println(car.wheels());
        System.out.println(car.turbo());


    }
}
