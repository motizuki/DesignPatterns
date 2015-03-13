package com.edu.designpattern.creational.abstractfactory;

import com.edu.common.customexceptions.InvalidOperationException;
import com.edu.designpattern.creational.abstractfactory.Factories.AbstractFactory;
import com.edu.designpattern.creational.abstractfactory.Factories.FactoryProducer;
import com.edu.common.exampleclasses.concreteclasses.Car;
import com.edu.common.exampleclasses.concreteclasses.Oven;
import com.edu.common.exampleclasses.Vehicle;
import com.edu.common.exampleclasses.WhiteGoods;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gustavokm90 on 11/3/14.
 */
public class AbstractFactoryDesignPatternDemo {
    private static final Logger logger = LoggerFactory.getLogger(AbstractFactoryDesignPatternDemo.class);

    public static void main(String[] args){

        try {
            AbstractFactory vehicleFactory = FactoryProducer.getFactory("Vehicle");

            Car car = (Car) vehicleFactory.createVehicle("Car");
            logger.info(car.drivingOnTheRoad());

            Vehicle boat = vehicleFactory.createVehicle("Boat");
            logger.info(boat.wheels());

            AbstractFactory whiteGoodsFactory = FactoryProducer.getFactory("WhiteGood");

            Oven oven = (Oven) whiteGoodsFactory.createWhiteGood("Oven");
            logger.info(oven.bake());

            WhiteGoods fridge = whiteGoodsFactory.createWhiteGood("Fridge");
            logger.info(fridge.energyUsage());


        } catch (InvalidOperationException e) {
            e.printStackTrace();
        }

    }
}
