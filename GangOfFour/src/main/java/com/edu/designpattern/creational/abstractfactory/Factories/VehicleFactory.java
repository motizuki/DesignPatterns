package com.edu.designpattern.creational.abstractfactory.Factories;

import com.edu.common.customexceptions.InvalidOperationException;
import com.edu.common.exampleclasses.concreteclasses.Boat;
import com.edu.common.exampleclasses.concreteclasses.Car;
import com.edu.common.exampleclasses.Vehicle;
import com.edu.common.exampleclasses.WhiteGoods;

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
