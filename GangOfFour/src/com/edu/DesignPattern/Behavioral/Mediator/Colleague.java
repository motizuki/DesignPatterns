package com.edu.DesignPattern.Behavioral.Mediator;

import com.edu.common.Products.Vehicle;

/**
 * Created by gustavokm90 on 1/30/15.
 */
public abstract class Colleague{

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void sendTransformationRequest();
}
