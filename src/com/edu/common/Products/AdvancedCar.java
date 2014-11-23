package com.edu.common.Products;

/**
 * Created by gustavokm90 on 11/22/14.
 */
public class AdvancedCar implements AdvancedVehicle {

    @Override
    public String turboBooster() {
        return ("Activating turbo boost");
    }

    @Override
    public String turboPrice() {
        return ("Activating turbo price $.$");
    }

    @Override
    public String turboWheels() {
        return ("Activating turbo wheels");
    }

}
