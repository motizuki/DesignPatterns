package com.edu.DesignPattern.Creational.AbstractFactory.Factories;

import com.edu.DesignPattern.Creational.AbstractFactory.CustomExceptions.InvalidOperationException;
import com.edu.DesignPattern.Creational.AbstractFactory.Products.Vehicle;
import com.edu.DesignPattern.Creational.AbstractFactory.Products.WhiteGoods;

/**
 * Created by gustavokm90 on 11/2/14.
 */
public abstract class AbstractFactory {

    public abstract Vehicle createVehicle(String vehicle) throws InvalidOperationException;
    public abstract WhiteGoods createWhiteGood(String whiteGoods) throws InvalidOperationException;

}
