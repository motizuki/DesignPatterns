package com.edu.DesignPattern.Creational.Builder;

import com.edu.common.CustomExceptions.InvalidOperationException;
import com.edu.DesignPattern.Creational.AbstractFactory.Factories.VehicleFactory;
import com.edu.common.Products.Boat;
import com.edu.common.Products.Car;
import com.edu.common.Products.Garage;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gustavokm90 on 11/6/14.
 */
public class GarageBuilder {

    private VehicleFactory vehicleFactory = new VehicleFactory();

    public Garage createGarageFiat() throws InvalidOperationException {

        Map<String, Car> garageCars = new HashMap<String, Car>();
        Map<String, Boat> garageBoats = new HashMap<String, Boat>();
        Car car = (Car) vehicleFactory.createVehicle("Car");

        car.setBrand("Fiat1");
        garageCars.put("1", car);
        car = (Car) vehicleFactory.createVehicle("Car");
        car.setBrand("Fiat2");
        garageCars.put("2",car);

        return new Garage(garageCars,garageBoats);
    }

    public Garage createGarageFord() throws InvalidOperationException {

        Map<String, Car> garageCars = new HashMap<String, Car>();
        Map<String, Boat> garageBoats = new HashMap<String, Boat>();
        Car car = (Car) vehicleFactory.createVehicle("Car");

        car.setBrand("Ford1");
        garageCars.put("1", car);
        car = (Car) vehicleFactory.createVehicle("Car");
        car.setBrand("Ford2");
        garageCars.put("2",car);

        return new Garage(garageCars,garageBoats);

    }


    public Garage createGarageBoats() throws InvalidOperationException {

        Map<String, Car> garageCars = new HashMap<String, Car>();
        Map<String, Boat> garageBoats = new HashMap<String, Boat>();
        Boat boat = (Boat) vehicleFactory.createVehicle("Boat");

        boat.setPrice(123);
        garageBoats.put("1", boat);
        boat = (Boat) vehicleFactory.createVehicle("Boat");
        boat.setPrice(321);
        garageBoats.put("2",boat);

        return new Garage(garageCars,garageBoats);

    }
}
