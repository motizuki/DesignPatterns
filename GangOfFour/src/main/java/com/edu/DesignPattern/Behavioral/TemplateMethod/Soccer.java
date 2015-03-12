package com.edu.designpattern.behavioral.templatemethod;

/**
 * Created by gustavokm90 on 1/31/15.
 */
public class Soccer extends Game{
    @Override
    void initialize() {
        System.out.println("Soccer Game Initialized!");

    }

    @Override
    void start() {
        System.out.println("Soccer Game Started!");

    }

    @Override
    void end() {
        System.out.println("Soccer Game Finished!");

    }
}
