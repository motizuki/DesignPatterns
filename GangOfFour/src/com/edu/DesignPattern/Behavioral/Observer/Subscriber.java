package com.edu.DesignPattern.Behavioral.Observer;

/**
 * Created by gustavokm90 on 1/30/15.
 */
public abstract class Subscriber {

    protected Publish publish;
    abstract public void update();
}
