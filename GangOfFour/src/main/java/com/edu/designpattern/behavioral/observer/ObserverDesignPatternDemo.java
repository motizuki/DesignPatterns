package com.edu.designpattern.behavioral.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gustavokm90 on 1/30/15.
 */
public class ObserverDesignPatternDemo {
    private static final Logger logger = LoggerFactory.getLogger(ObserverDesignPatternDemo.class);

    public static void main(String[] args) {

        Publish publish = new Publish();

        Subscriber fooSubscriber = new FooSubscriber(publish);
        Subscriber booSubscriber = new BooSubscriber(publish);

        logger.info("Chaging the state of the publisher...");
        publish.setState(999);
        logger.info("Chaging the state of the publisher...");
        publish.setState(111);


    }
}
