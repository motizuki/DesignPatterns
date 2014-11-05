package com.edu.DesignPattern.Creational.FactoryMethod;


/**
 * Created by gustavokm90 on 11/3/14.
 */

public class FactoryMethod{

    public static Battery newOrdinaryBattery(){

        //Setting all attributes to create the ordinary battery object parameters and any other procedure.

        //setting these data here just for a matter of test, this should be handled  by the factory method
        final String productName = "ORDINARY BATTERY";
        final String fabCompany = "ORDINARIES";
        final Boolean perishable = false;
        final Integer batterySize = 5;
        final Integer batteryCapacity = 10;

        return new OrdinaryBattery(productName,fabCompany,perishable,batterySize,batteryCapacity);
    }

}