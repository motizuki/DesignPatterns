package com.edu.DesignPattern.Creational.Builder;

import com.edu.DesignPattern.Creational.AbstractFactory.Products.Boat;
import com.edu.DesignPattern.Creational.AbstractFactory.Products.Car;

import java.util.Map;

/**
 * Created by gustavokm90 on 11/6/14.
 */
public class Garage {

    private Map<String, Car> cars;
    private Map<String, Boat> boats;

    public Garage(Map<String, Car> cars, Map<String,Boat> boats){
        setCars(cars);
        setBoats(boats);
    }

    public void showGarageVehicles(){
        for (Map.Entry<String,Car> entry : cars.entrySet()){
            System.out.println("Cars: "+ entry.getKey() +" - "+ entry.getValue().getBrand());
        }
        for (Map.Entry<String,Boat> entry : boats.entrySet()){
            System.out.println("Boats: "+ entry.getKey() +" - "+ entry.getValue().getPrice());
        }

    }

    public Map<String, Car> getCars() {
        return cars;
    }

    public void setCars(Map<String, Car> cars) {
        this.cars = cars;
    }

    public Map<String, Boat> getBoats() {
        return boats;
    }

    public void setBoats(Map<String, Boat> boats) {
        this.boats = boats;
    }
}
