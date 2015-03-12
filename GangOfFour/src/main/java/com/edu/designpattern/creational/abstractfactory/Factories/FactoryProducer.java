package com.edu.designpattern.creational.abstractfactory.Factories;

import com.edu.common.customexceptions.InvalidOperationException;

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
