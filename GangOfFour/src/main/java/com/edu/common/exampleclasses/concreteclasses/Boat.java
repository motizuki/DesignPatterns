package com.edu.common.exampleclasses.concreteclasses;

import com.edu.annotations.ApplicationService;
import com.edu.common.exampleclasses.Vehicle;

/**
 * Created by gustavokm90 on 11/2/14.
 */
@ApplicationService
public class Boat implements Vehicle {

    private int wheels;
    private double price;

    public Boat(){
        this.setPrice(20000);
        this.setWheels(0);
    }

    @Override
    public String wheels() {
        return "This vehicle does not need wheels";
    }

    @Override
    public String price() {
        return "This vehicle cost $"+getPrice();
    }

    public String turbo(){
        return "Normal boats does not have turbo!";
    }

    @Override
    public String specificAction() {
        return "Floating in the sea...";
    }

    public String floatingInTheSea(){
        return "Floating in the sea...";
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }


}
