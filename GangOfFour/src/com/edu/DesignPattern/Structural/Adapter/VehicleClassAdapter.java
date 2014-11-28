package com.edu.DesignPattern.Structural.Adapter;

import com.edu.common.Products.AdvancedVehicle;
import com.edu.common.Products.Vehicle;

/**
 * Created by gustavokm90 on 11/21/14.
 */
public class VehicleClassAdapter implements Vehicle, AdvancedVehicle {

    private String wheels;
    private String price;
    private String turbo;


    public VehicleClassAdapter(String carType) {
        if (carType.equals("advCar")){
            this.wheels = "Activating Class turbo wheels";
            this.price = "Activation Class turbo price";
            this.turbo = "Activations Class turbo boost";
        }
    }

    @Override
    public String turboBooster() {
        return this.turbo;
    }

    @Override
    public String turboPrice() {
        return this.price;
    }

    @Override
    public String turboWheels() {
        return this.wheels;
    }

    @Override
    public String wheels() {
        return turboWheels();
    }

    @Override
    public String price() {
        return turboPrice();
    }

    @Override
    public String turbo() {
        return turboBooster();
    }
}
