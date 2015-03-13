package com.edu.designpattern.behavioral.mediator;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gustavokm90 on 1/30/15.
 */
public class MediatorDesignPatternDemo {
    private static final Logger logger = LoggerFactory.getLogger(MediatorDesignPatternDemo.class);

    public static void main(String[] args) {

        Colleague colleague = new ConcreteColleague();

        logger.info("Starting a request from a Colleague...");
        colleague.sendTransformationRequest();
    }
}
