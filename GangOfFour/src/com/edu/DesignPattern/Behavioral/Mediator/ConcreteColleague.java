package com.edu.DesignPattern.Behavioral.Mediator;

/**
 * Created by gustavokm90 on 1/30/15.
 */
public class ConcreteColleague extends Colleague {

    @Override
    public void sendTransformationRequest() {
        //business logic...
        this.setName("Changing the name of the colleague");
        //Using mediator to retrieve/process information
        new Mediator(this).transformColleague();
    }
}
