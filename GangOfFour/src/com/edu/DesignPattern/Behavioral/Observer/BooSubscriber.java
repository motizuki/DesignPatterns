package com.edu.DesignPattern.Behavioral.Observer;

/**
 * Created by gustavokm90 on 1/30/15.
 */
public class BooSubscriber extends Subscriber {

    public BooSubscriber(Publish publish) {
        this.publish = publish;
        this.publish.attachSubscriber(this);
    }

    @Override
    public void update() {
        System.out.println("BooSubscriber update "+ publish.getState());
    }
}
