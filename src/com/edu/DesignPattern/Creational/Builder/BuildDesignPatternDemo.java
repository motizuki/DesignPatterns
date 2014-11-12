package com.edu.DesignPattern.Creational.Builder;

import com.edu.common.CustomExceptions.InvalidOperationException;
import com.edu.common.Products.Garage;

/**
 * Created by gustavokm90 on 11/6/14.
 */
public class BuildDesignPatternDemo {
    public static void main (String[] args){
        GarageBuilder garageBuilder = new GarageBuilder();

        try {
            Garage fiat = garageBuilder.createGarageFiat();
            fiat.showGarageVehicles();

            Garage ford = garageBuilder.createGarageFord();
            ford.showGarageVehicles();

            Garage boat = garageBuilder.createGarageBoats();
            boat.showGarageVehicles();
        } catch (InvalidOperationException e) {
            e.printStackTrace();
        }

    }
}
