package com.edu.DesignPattern.Creational.AbstractFactory.Factories;

import com.edu.DesignPattern.Creational.AbstractFactory.CustomExceptions.InvalidOperationException;

/**
 * Created by gustavokm90 on 11/3/14.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryType) throws InvalidOperationException {
        if (factoryType.equals("Vehicle")){
            return new VehicleFactory();
        }
        if (factoryType.equals("WhiteGood")){
            return new WhiteGoodFactory();
        }
        throw new InvalidOperationException("Invalid factory type");
    }
}
