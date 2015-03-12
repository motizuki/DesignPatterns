package com.edu.designpattern.behavioral.mediator;
/**
 * Created by gustavokm90 on 1/30/15.
 */
public class Mediator {

    Colleague colleague;

    public Mediator(Colleague colleague){
        this.colleague = colleague;
    }

    public void transformColleague(){
        System.out.println("mediator... do mediator stuff ");
        System.out.println(colleague.getName() + ", this has been triggered from the mediator");
    }

}
