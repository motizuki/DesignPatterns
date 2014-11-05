package com.edu.DesignPattern.Creational.FactoryMethod;

/**
 * Created by gustavokm90 on 11/5/14.
 */
public class FactoryMethodDesignPatternDemo {

    public static void main (String[] args){

        Battery battery = FactoryMethod.newOrdinaryBattery();
        battery.whoAmI();
        System.out.print(battery.toString());

    }
}
