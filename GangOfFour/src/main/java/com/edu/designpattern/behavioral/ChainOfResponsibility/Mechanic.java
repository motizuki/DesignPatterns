package com.edu.designpattern.behavioral.chainofresponsibility;

import com.edu.common.exampleclasses.Car;

/**
 * Created by gustavokm90 on 1/27/15.
 */
public abstract class Mechanic {

    protected Mechanic successor;
    protected String type;

    public void setSuccessor(Mechanic successor){
        this.successor = successor;
    }

    public void handleRequest(Car car){
        if(car.getBrand().equals(type)){
            fixCar(car);
        }
        if(successor != null){
            successor.handleRequest(car);
        }
    }

    abstract protected void fixCar(Car car);

}
