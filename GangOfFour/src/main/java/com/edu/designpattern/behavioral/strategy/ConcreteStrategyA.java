package com.edu.designpattern.behavioral.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gustavokm90 on 1/31/15.
 */
public class ConcreteStrategyA implements Strategy
{
    private static final Logger logger = LoggerFactory.getLogger(ConcreteStrategyA.class);

    @Override
    public void processAlgorithm() {
        logger.info("Processing Algorithm A...");
    }
}
