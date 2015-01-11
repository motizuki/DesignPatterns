package com.edu.DesignPattern.Structural.Proxy;

/**
 * Created by gustavokm90 on 1/4/15.
 */
public class RemoteObject {

    public RemoteObject() {
        System.out.println("Creating a object to access remote data");
    }

    public void remoteMethod(){
        System.out.println("Accessing remote data...");
    }
}
