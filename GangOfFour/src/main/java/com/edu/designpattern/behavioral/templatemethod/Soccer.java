package com.edu.designpattern.behavioral.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gustavokm90 on 1/31/15.
 */
public class Soccer extends Game{
    private static final Logger logger = LoggerFactory.getLogger(Soccer.class);

    @Override
    void initialize() {
        logger.info("Soccer Game Initialized!");

    }

    @Override
    void start() {
        logger.info("Soccer Game Started!");

    }

    @Override
    void end() {
        logger.info("Soccer Game Finished!");

    }
}
