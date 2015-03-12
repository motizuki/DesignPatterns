package com.edu.designpattern.behavioral.visitor;

/**
 * Created by gustavokm90 on 1/31/15.
 */
public class Visited {

    public String showMessage(){
        return ("Data to show when someone visit...");
    }

    public void accept(Visitor visitor){
        visitor.visitSomeone(this);
    }
}
