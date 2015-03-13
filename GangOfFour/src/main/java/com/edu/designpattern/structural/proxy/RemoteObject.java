package com.edu.designpattern.structural.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gustavokm90 on 1/4/15.
 */
public class RemoteObject {

    private static final Logger logger = LoggerFactory.getLogger(RemoteObject.class);


    public RemoteObject() {
        logger.info("Creating a object to access remote data");
    }

    public void remoteMethod(){
        logger.info("Accessing remote data...");
    }
}
