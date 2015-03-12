package com.edu.designpattern.creational.abstractfactory.Factories;

import com.edu.common.customexceptions.InvalidOperationException;
import com.edu.common.exampleclasses.Fridge;
import com.edu.common.exampleclasses.Oven;
import com.edu.common.exampleclasses.Vehicle;
import com.edu.common.exampleclasses.WhiteGoods;

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
