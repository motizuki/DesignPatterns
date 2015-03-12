package com.edu.designpattern.creational.singleton;

/**
 * Created by gustavokm90 on 11/5/14.
 */
public class Singleton {

    public static Singleton instance = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("I am a singleton");

    }
}
