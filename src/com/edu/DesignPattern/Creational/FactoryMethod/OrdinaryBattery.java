package com.edu.DesignPattern.Creational.FactoryMethod;

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

}
