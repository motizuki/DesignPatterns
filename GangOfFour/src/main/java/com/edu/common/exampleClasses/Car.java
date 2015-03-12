package com.edu.common.exampleclasses;

import com.edu.annotations.ApplicationService;

/**
 * Created by gustavokm90 on 11/2/14.
 */
@ApplicationService
public class Car implements Vehicle{

    private int wheels;
    private double price;
    private String brand;

    public Car(){
        this.setPrice(10000);
        this.setWheels(4);
    }

    @Override
    public String wheels() {
        return "This vehicle has "+getWheels()+" wheel(s)";
    }

    @Override
    public String price() {
        return "This vehicle cost $"+getPrice();
    }

    public String drivingOnTheRoad(){
        return "Driving on the road...";
    }

    public String turbo(){
        return "Normal cars does not have turbo!";
    }

    @Override
    public String specificAction() {
        return "Driving on the road...";
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
