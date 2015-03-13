package com.edu.designpattern.behavioral.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gustavokm90 on 1/31/15.
 */
public class Visitor {
    private static final Logger logger = LoggerFactory.getLogger(Visitor.class);


    public void visitSomeone(Visited visited){

        logger.info("Visiting... - " + visited.showMessage());
    }
}
