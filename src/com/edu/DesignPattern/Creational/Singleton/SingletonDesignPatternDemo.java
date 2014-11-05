package com.edu.DesignPattern.Creational.Singleton;

/**
 * Created by gustavokm90 on 11/5/14.
 */
public class SingletonDesignPatternDemo {

    public static void main (String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }
}
