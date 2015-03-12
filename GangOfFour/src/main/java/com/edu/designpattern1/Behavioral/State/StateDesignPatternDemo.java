package com.edu.designpattern.behavioral.state;

/**
 * Created by gustavokm90 on 1/30/15.
 */
public class StateDesignPatternDemo {

    public static void main(String[] args) {
        Context context = new Context();

        State b = new StateB();

        context.request("Message 1");

        context.setState(b);

        context.request("Message 2");
        context.request("Message 3");

    }
}
