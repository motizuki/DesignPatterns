package com.edu.DesignPattern.Creational.AbstractFactory.Products;

/**
 * Created by gustavokm90 on 11/2/14.
 */
public class Car implements Vehicle{

    private int wheels;
    private double price;

    public Car(int wheels, double price){
        this.setPrice(price);
        this.setWheels(wheels);
    }

    @Override
    public int wheels() {
        return this.getWheels();
    }

    @Override
    public double price() {
        return this.getPrice();
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
