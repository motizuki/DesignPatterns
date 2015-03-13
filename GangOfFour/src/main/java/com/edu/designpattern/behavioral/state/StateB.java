package com.edu.designpattern.behavioral.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gustavokm90 on 1/31/15.
 */
public class StateB implements State {

    private static final Logger logger = LoggerFactory.getLogger(StateB.class);

    @Override
    public void doAction(Context context) {
        logger.info("Start action of StateB.");
        logger.info("Perform business logic...");
        logger.info("Changing state at runtime");
        context.setState(new StateA());
    }

    public String toString(){
        return ("state B state.");
    }
}
