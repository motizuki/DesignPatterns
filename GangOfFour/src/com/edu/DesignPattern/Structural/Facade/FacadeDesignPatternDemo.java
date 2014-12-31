package com.edu.DesignPattern.Structural.Facade;

/**
 * Created by gustavokm90 on 12/30/14.
 */
public class FacadeDesignPatternDemo {
    public static void main(String[] args){

        //interface facade to an hybrid car, instanciating 2 objects car and boat, and use their methods
        HybridVehicle hybridVehicle = new HybridVehicle();

        hybridVehicle.DriveOnTheRoad();
        hybridVehicle.DriveOnTheSea();
    }

}
