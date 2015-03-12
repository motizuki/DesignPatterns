package com.edu.designpattern.structural.proxy;

/**
 * Created by gustavokm90 on 1/10/15.
 */
public class ProxyDesignPatternDemo {

    public static void main(String[] args){

        System.out.println("Accessing remote object directly");
        RemoteObject remoteObject = new RemoteObject();
        remoteObject.remoteMethod();

        System.out.println("Accessing remote object through the proxy");
        RemoteObjectProxy remoteObjectProxy = new RemoteObjectProxy();
        System.out.println("Calling the remote method in the remote object");
        remoteObjectProxy.remoteMethod();
    }
}
