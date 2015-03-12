package com.edu.designpattern.behavioral.state;

/**
 * Created by gustavokm90 on 1/31/15.
 */
public class StateB implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Start action of StateB.");
        System.out.println("Perform business logic...");
        System.out.println("Changing state at runtime");
        context.setState(new StateA());
    }

    public String toString(){
        return ("state B state.");
    }
}
