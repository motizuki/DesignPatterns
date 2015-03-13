package com.edu.designpattern.behavioral.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gustavokm90 on 1/30/15.
 */
public class Mediator {

    private static final Logger logger = LoggerFactory.getLogger(Mediator.class);

    Colleague colleague;

    public Mediator(Colleague colleague){
        this.colleague = colleague;
    }

    public void transformColleague(){
        logger.info("mediator... do mediator stuff ");
        logger.info(colleague.getName() + ", this has been triggered from the mediator");
    }

}
