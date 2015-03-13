package com.edu.designpattern.behavioral.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gustavokm90 on 1/30/15.
 */
public class FooSubscriber extends Subscriber {

    private static final Logger logger = LoggerFactory.getLogger(FooSubscriber.class);

    public FooSubscriber(Publish publish) {
        this.publish = publish;
        this.publish.attachSubscriber(this);
    }

    @Override
    public void update() {
        logger.info("FooSubscriber update "+ publish.getState());
    }
}
