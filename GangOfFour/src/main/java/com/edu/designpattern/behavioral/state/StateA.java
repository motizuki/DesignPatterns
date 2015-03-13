package com.edu.designpattern.behavioral.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gustavokm90 on 1/31/15.
 */
public class StateA implements State {

    private static final Logger logger = LoggerFactory.getLogger(StateA.class);

    @Override
    public void doAction(Context context) {
        logger.info("Start action of StateA.");
        logger.info("Perform business logic...");
        logger.info("Change state is needed...");
        context.setState(this);
    }

    public String toString(){
        return ("state A state.");
    }
}
