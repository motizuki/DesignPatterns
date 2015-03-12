package com.edu.designpattern.behavioral.state;

/**
 * Created by gustavokm90 on 1/31/15.
 */
public class Context {

    private State state;


    public Context() {
        state = new StateA();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request(String input){
        System.out.println("Send request: "+input+ " with the state: "+this.getState().toString());
        state.doAction(this);
    }

}
