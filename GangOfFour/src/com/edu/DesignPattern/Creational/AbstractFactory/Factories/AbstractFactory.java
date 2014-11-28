package com.edu.DesignPattern.Creational.AbstractFactory.Factories;

import com.edu.common.CustomExceptions.InvalidOperationException;
import com.edu.common.Products.Vehicle;
import com.edu.common.Products.WhiteGoods;

/**
 * Created by gustavokm90 on 11/2/14.
 */
public abstract class AbstractFactory {

    public abstract Vehicle createVehicle(String vehicle) throws InvalidOperationException;
    public abstract WhiteGoods createWhiteGood(String whiteGoods) throws InvalidOperationException;

}
