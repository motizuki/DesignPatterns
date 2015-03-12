package com.edu.designpattern.behavioral.mediator;

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
