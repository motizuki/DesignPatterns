package com.edu.DesignPattern.Behavioral.Visitor;

/**
 * Created by gustavokm90 on 1/31/15.
 */
public class Visitor {

    public void visitSomeone(Visited visited){

        System.out.println("Visiting... - " + visited.showMessage());
    }
}
