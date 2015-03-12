package com.edu.designpattern.behavioral.state;

/**
 * Created by gustavokm90 on 1/31/15.
 */
public class StateA implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Start action of StateA.");
        System.out.println("Perform business logic...");
        System.out.println("Change state is needed...");
        context.setState(this);
    }

    public String toString(){
        return ("state A state.");
    }
}
