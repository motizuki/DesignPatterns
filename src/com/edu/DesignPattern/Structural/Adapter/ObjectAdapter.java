package com.edu.DesignPattern.Structural.Adapter;

import com.edu.common.Products.AdvancedCar;
import com.edu.common.Products.AdvancedVehicle;
import com.edu.common.Products.Vehicle;

/**
 * Created by gustavokm90 on 11/21/14.
 */
public class ObjectAdapter implements Vehicle{

    //Adaptor for the interface AdvancedVehicle to Vehicle

    AdvancedVehicle advancedVehicle;

    public ObjectAdapter(String carType) {
        if (carType.equals("advCar")){
            advancedVehicle = new AdvancedCar();
        }
    }

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
}
