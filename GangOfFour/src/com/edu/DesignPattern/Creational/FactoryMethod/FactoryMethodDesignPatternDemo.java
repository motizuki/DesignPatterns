package com.edu.DesignPattern.Creational.FactoryMethod;

import com.edu.common.Products.Battery;

/**
 * Created by gustavokm90 on 11/5/14.
 */
public class FactoryMethodDesignPatternDemo {

    public static void main (String[] args){

        Battery battery = OrdinaryBattery.newOrdinaryBattery();
        battery.whoAmI();
        System.out.print(battery.toString());
        System.out.print(battery.toString());

    }
}
