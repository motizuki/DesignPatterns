package com.edu.designpattern.behavioral.templatemethod;

/**
 * Created by gustavokm90 on 1/31/15.
 */
public abstract class Game {

    abstract void initialize();
    abstract void start();
    abstract void end();


    //Template method
    public final void play(){

        initialize();
        start();
        end();

    }
}
