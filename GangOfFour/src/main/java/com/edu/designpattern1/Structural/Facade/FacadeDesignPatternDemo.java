package com.edu.designpattern.structural.facade;

import com.edu.springconfigclasses.ConfigFacade;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by gustavokm90 on 12/30/14.
 */

public class FacadeDesignPatternDemo {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ConfigFacade.class);
        HybridVehicle hybridVehicle = (HybridVehicle) context.getBean("hybridVehicle");

        //interface facade to an hybrid car, instantiating 2 objects car and boat, and use their methods

        hybridVehicle.driveOnTheRoad();
        hybridVehicle.driveOnTheSea();
        hybridVehicle.cook();

    }
}
