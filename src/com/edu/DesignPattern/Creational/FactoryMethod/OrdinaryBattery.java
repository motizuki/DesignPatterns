package com.edu.DesignPattern.Creational.FactoryMethod;

import com.edu.common.Products.Battery;

/**
 * Created by gustavokm90 on 11/5/14.
 * This is a concrete type of product
 */
public class OrdinaryBattery extends Battery {


    protected OrdinaryBattery(String productName, String fabCompany, Boolean perishable, Integer batterySize, Integer batteryCapacity) {
        super(productName, fabCompany, perishable, batterySize, batteryCapacity);
    }

    //Adding/overriding/implementing  any specific feature for this class
    @Override
    public void whoAmI(){
        System.out.println("I am a Ordinary Battery");
    }

    //Factory method
    public static Battery newOrdinaryBattery(){

        //Setting all attributes to create the ordinary battery object parameters and any other procedure.
        final String productName = "ORDINARY BATTERY";
        final String fabCompany = "ORDINARIES";
        final Boolean perishable = false;
        final Integer batterySize = 5;
        final Integer batteryCapacity = 10;

        return new OrdinaryBattery(productName,fabCompany,perishable,batterySize,batteryCapacity);
    }


}
