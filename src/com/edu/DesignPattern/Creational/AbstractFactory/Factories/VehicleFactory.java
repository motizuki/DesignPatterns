package com.edu.DesignPattern.Creational.AbstractFactory.Factories;

import com.edu.DesignPattern.Creational.AbstractFactory.CustomExceptions.InvalidOperationException;
import com.edu.DesignPattern.Creational.AbstractFactory.Products.Boat;
import com.edu.DesignPattern.Creational.AbstractFactory.Products.Car;
import com.edu.DesignPattern.Creational.AbstractFactory.Products.Vehicle;
import com.edu.DesignPattern.Creational.AbstractFactory.Products.WhiteGoods;

/**
 * Created by gustavokm90 on 11/3/14.
 */
public class VehicleFactory extends AbstractFactory {

    @Override
    public WhiteGoods createWhiteGood(String whiteGoods) throws InvalidOperationException {
        throw new InvalidOperationException("Invalid operation vehicle factory cannot create white goods");
    }

    @Override
    public Vehicle createVehicle(String vehicle) throws InvalidOperationException {
        if (vehicle == null){
            throw new InvalidOperationException("Invalid vehicle");
        }if (vehicle.equals("Car")){
            return new Car();
        }if (vehicle.equals("Boat")){
            return new Boat();
        }
        throw new InvalidOperationException("Invalid vehicle");
    }
}
