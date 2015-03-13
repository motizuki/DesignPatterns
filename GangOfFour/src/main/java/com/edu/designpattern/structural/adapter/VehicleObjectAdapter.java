package com.edu.designpattern.structural.adapter;

import com.edu.common.exampleclasses.concreteclasses.AdvancedCar;
import com.edu.common.exampleclasses.AdvancedVehicle;
import com.edu.common.exampleclasses.Vehicle;

/**
 * Created by gustavokm90 on 11/21/14.
 */
public class VehicleObjectAdapter implements Vehicle{

    //Adaptor for the interface AdvancedVehicle to Vehicle

    AdvancedVehicle advancedVehicle;

    public VehicleObjectAdapter(String carType) {
        if (carType.equals("advCar")){

            //creating the object that is going to be adapted to Vehicle class
            advancedVehicle = new AdvancedCar(carType);
        }
    }

    //Adapting the methods to Vehicle class

    @Override
    public String wheels() {
        return advancedVehicle.turboWheels();
    }

    @Override
    public String price() {
        return advancedVehicle.turboPrice();
    }

    public String turbo(){
        return advancedVehicle.turboBooster();
    }

    @Override
    public String specificAction() {
        return "no specific action";
    }
}
