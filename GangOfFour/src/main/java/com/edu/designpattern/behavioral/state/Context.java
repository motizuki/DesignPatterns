package com.edu.designpattern.behavioral.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gustavokm90 on 1/31/15.
 */
public class Context {

    private static final Logger logger = LoggerFactory.getLogger(Context.class);

    private State state;


    public Context() {
        state = new StateA();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request(String input){
        logger.info("Send request: "+input+ " with the state: "+this.getState().toString());
        state.doAction(this);
    }

}
