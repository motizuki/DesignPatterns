package com.edu.designpattern.creational.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gustavokm90 on 11/5/14.
 */
public class Singleton {
    private static final Logger logger = LoggerFactory.getLogger(Singleton.class);


    public static Singleton instance = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return instance;
    }

    public void showMessage(){
        logger.info("I am a singleton");

    }
}
