package com.edu.DesignPattern.Creational.AbstractFactory;

import com.edu.common.CustomExceptions.InvalidOperationException;
import com.edu.DesignPattern.Creational.AbstractFactory.Factories.AbstractFactory;
import com.edu.DesignPattern.Creational.AbstractFactory.Factories.FactoryProducer;
import com.edu.common.Products.Car;
import com.edu.common.Products.Oven;
import com.edu.common.Products.Vehicle;
import com.edu.common.Products.WhiteGoods;

/**
 * Created by gustavokm90 on 11/3/14.
 */
public class AbstractFactoryDesignPatternDemo {
    public static void main(String[] args){

        try {
            AbstractFactory vehicleFactory = FactoryProducer.getFactory("Vehicle");

            Car car = (Car) vehicleFactory.createVehicle("Car");
            System.out.println(car.drivingInTheRoad());

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
