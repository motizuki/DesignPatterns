package com.edu.designpattern.structural.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gustavokm90 on 1/4/15.
 */
public class RemoteObjectProxy {
    private static final Logger logger = LoggerFactory.getLogger(RemoteObjectProxy.class);


    RemoteObject remoteObject;

    public RemoteObjectProxy() {
        logger.info("Creating a proxy object to access a remote object");
    }

    public void remoteMethod(){
        if (remoteObject == null) {
            remoteObject = new RemoteObject();
        }
        remoteObject.remoteMethod();
    }

}
