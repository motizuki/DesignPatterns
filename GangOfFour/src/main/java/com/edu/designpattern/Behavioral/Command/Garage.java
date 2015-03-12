package com.edu.designpattern.behavioral.command;

import java.util.ArrayList;

/**
 * Created by gustavokm90 on 1/28/15.
 */
public class Garage {

    private ArrayList<Action> actions = new ArrayList<Action>();

    public void takeActions(Action action){
        this.actions.add(action);
    }

    public void performActions(){
        for (Action action : actions) {
            action.execute();
        }
        actions.clear();
    }
}
