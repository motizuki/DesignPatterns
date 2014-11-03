package com.edu.DesignPattern.Creational.AbstractFactory.Factories;

import com.edu.DesignPattern.Creational.AbstractFactory.CustomExceptions.InvalidOperationException;
import com.edu.DesignPattern.Creational.AbstractFactory.Products.Fridge;
import com.edu.DesignPattern.Creational.AbstractFactory.Products.Oven;
import com.edu.DesignPattern.Creational.AbstractFactory.Products.Vehicle;
import com.edu.DesignPattern.Creational.AbstractFactory.Products.WhiteGoods;

/**
 * Created by gustavokm90 on 11/3/14.
 */
public class WhiteGoodFactory extends AbstractFactory {
    @Override
    public Vehicle createVehicle(String vehicle) throws InvalidOperationException {
        throw new InvalidOperationException("Invalid operation white good factory cannot create vehicle");
    }

    @Override
    public WhiteGoods createWhiteGood(String whiteGoods) throws InvalidOperationException {
        if (whiteGoods == null) {
            throw new InvalidOperationException("Invalid white good");
        }
        if (whiteGoods.equals("Oven")) {
            return new Oven();
        }
        if (whiteGoods.equals("Fridge")) {
            return new Fridge();
        }
        throw new InvalidOperationException("Invalid white good");
    }
}
