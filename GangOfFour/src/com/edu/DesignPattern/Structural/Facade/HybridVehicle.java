package com.edu.DesignPattern.Structural.Facade;

import com.edu.common.Products.Boat;
import com.edu.common.Products.Car;

/**
 * Created by gustavokm90 on 12/30/14.
 */
public class HybridVehicle {

    private Car car;
    private Boat boat;

    public HybridVehicle(){
        car = new Car();
        boat = new Boat();
    }

    public void DriveOnTheSea(){
        System.out.println(boat.floatingInTheSea());
    }

    public void DriveOnTheRoad(){
        System.out.println(car.drivingOnTheRoad());
    }

}
