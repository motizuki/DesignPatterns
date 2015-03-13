package com.edu.designpattern.behavioral.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gustavokm90 on 1/30/15.
 */
public class BooSubscriber extends Subscriber {

    private static final Logger logger = LoggerFactory.getLogger(BooSubscriber.class);

    public BooSubscriber(Publish publish) {
        this.publish = publish;
        this.publish.attachSubscriber(this);
    }

    @Override
    public void update() {
        logger.info("BooSubscriber update "+ publish.getState());
    }
}
