package com.edu.common.exampleclasses;

/**
 * Created by gustavokm90 on 11/22/14.
 */
public class AdvancedCar implements AdvancedVehicle {

    private String wheels;
    private String price;
    private String turbo;


    public AdvancedCar(String carType) {
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

}
