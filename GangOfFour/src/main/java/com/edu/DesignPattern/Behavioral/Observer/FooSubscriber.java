package com.edu.designpattern.behavioral.observer;

/**
 * Created by gustavokm90 on 1/30/15.
 */
public class FooSubscriber extends Subscriber {

    public FooSubscriber(Publish publish) {
        this.publish = publish;
        this.publish.attachSubscriber(this);
    }

    @Override
    public void update() {
        System.out.println("FooSubscriber update "+ publish.getState());
    }
}
