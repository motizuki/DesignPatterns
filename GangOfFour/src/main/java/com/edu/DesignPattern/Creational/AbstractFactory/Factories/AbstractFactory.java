package com.edu.designpattern.creational.abstractfactory.Factories;

import com.edu.common.customexceptions.InvalidOperationException;
import com.edu.common.exampleclasses.Vehicle;
import com.edu.common.exampleclasses.WhiteGoods;

/**
 * Created by gustavokm90 on 11/2/14.
 */
public abstract class AbstractFactory {

    public abstract Vehicle createVehicle(String vehicle) throws InvalidOperationException;
    public abstract WhiteGoods createWhiteGood(String whiteGoods) throws InvalidOperationException;

}
