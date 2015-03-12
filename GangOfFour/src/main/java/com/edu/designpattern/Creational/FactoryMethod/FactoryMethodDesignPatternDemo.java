package com.edu.designpattern.creational.factorymethod;

import com.edu.common.exampleclasses.Battery;

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
