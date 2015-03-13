package com.edu.designpattern.structural.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gustavokm90 on 1/10/15.
 */
public class ProxyDesignPatternDemo {

    private static final Logger logger = LoggerFactory.getLogger(ProxyDesignPatternDemo.class);

    public static void main(String[] args){

        logger.info("Accessing remote object directly");
        RemoteObject remoteObject = new RemoteObject();
        remoteObject.remoteMethod();

        logger.info("Accessing remote object through the proxy");
        RemoteObjectProxy remoteObjectProxy = new RemoteObjectProxy();
        logger.info("Calling the remote method in the remote object");
        remoteObjectProxy.remoteMethod();
    }
}
