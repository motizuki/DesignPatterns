package com.edu.designpattern.structural.flyweight;

import com.edu.common.exampleclasses.Vehicle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gustavokm90 on 12/31/14.
 */
public class FlyweightDesignPatternDemo {

    private static final Logger logger = LoggerFactory.getLogger(FlyweightDesignPatternDemo.class);


    private static String[] colors = {"Blue", "Black", "White", "Red", "Yellow"};

    public static void main(String[] args){

        for (int a = 0; a<10; a++){
            Vehicle vehicle = FlyweightVehiclePool.getVehicle(getRandomColor(),"advCar");
            logger.info(vehicle.wheels());
        }
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }

}
