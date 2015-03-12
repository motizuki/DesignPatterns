package com.edu.designpattern.behavioral.observer;

/**
 * Created by gustavokm90 on 1/30/15.
 */
public abstract class Subscriber {

    protected Publish publish;
    abstract public void update();
}
