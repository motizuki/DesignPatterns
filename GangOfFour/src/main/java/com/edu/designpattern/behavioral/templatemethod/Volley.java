package com.edu.designpattern.behavioral.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gustavokm90 on 1/31/15.
 */
public class Volley extends Game {
    private static final Logger logger = LoggerFactory.getLogger(Volley.class);

    @Override
    void initialize() {
        logger.info("Volley Game Initialized!");

    }

    @Override
    void start() {
        logger.info("Volley Game Started!");

    }

    @Override
    void end() {
        logger.info("Volley Game Finished!");

    }
}
