package com.edu.DesignPattern.Structural.Proxy;

/**
 * Created by gustavokm90 on 1/4/15.
 */
public class RemoteObjectProxy {

    RemoteObject remoteObject;

    public RemoteObjectProxy() {
        System.out.println("Creating a proxy object to access a remote object");
    }

    public void remoteMethod(){
        if (remoteObject == null) {
            remoteObject = new RemoteObject();
        }
        remoteObject.remoteMethod();
    }

}
