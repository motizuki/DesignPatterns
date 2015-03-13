package com.edu.designpattern.creational.abstractfactory;

import com.edu.common.customexceptions.InvalidOperationException;
import com.edu.designpattern.creational.abstractfactory.Factories.AbstractFactory;
import com.edu.designpattern.creational.abstractfactory.Factories.FactoryProducer;
import com.edu.common.exampleclasses.concreteclasses.Car;
import com.edu.common.exampleclasses.concreteclasses.Oven;
import com.edu.common.exampleclasses.Vehicle;
import com.edu.common.exampleclasses.WhiteGoods;

/**
 * Created by gustavokm90 on 11/3/14.
 */
public class AbstractFactoryDesignPatternDemo {
    public static void main(String[] args){

        try {
            AbstractFactory vehicleFactory = FactoryProducer.getFactory("Vehicle");

            Car car = (Car) vehicleFactory.createVehicle("Car");
            System.out.println(car.drivingOnTheRoad());

            Vehicle boat = vehicleFactory.createVehicle("Boat");
            System.out.println(boat.wheels());

            AbstractFactory whiteGoodsFactory = FactoryProducer.getFactory("WhiteGood");

            Oven oven = (Oven) whiteGoodsFactory.createWhiteGood("Oven");
            System.out.println(oven.bake());

            WhiteGoods fridge = whiteGoodsFactory.createWhiteGood("Fridge");
            System.out.println(fridge.energyUsage());


        } catch (InvalidOperationException e) {
            e.printStackTrace();
        }

    }
}
