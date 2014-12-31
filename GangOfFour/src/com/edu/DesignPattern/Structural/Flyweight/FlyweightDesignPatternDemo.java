package com.edu.DesignPattern.Structural.Flyweight;

import com.edu.common.Products.Vehicle;

/**
 * Created by gustavokm90 on 12/31/14.
 */
public class FlyweightDesignPatternDemo {

    private static String[] colors = {"Blue", "Black", "White", "Red", "Yellow"};
    private static String[] type = {"advCar"};


    public static void main(String[] args){

        for (int a = 0; a<10; a++){
            Vehicle vehicle = FlyweightVehiclePool.getVehicle(getRandomColor(),getRandomType());
            System.out.println(vehicle.wheels());
        }
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static String getRandomType() {
        return type[(int)(Math.random()*type.length)];
    }

}
