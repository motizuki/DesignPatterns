package com.edu.springconfigclasses;

import com.edu.common.exampleclasses.*;
import com.edu.common.exampleclasses.concreteclasses.Car;
import com.edu.designpattern.structural.facade.HybridVehicle;
import org.aspectj.lang.JoinPoint;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

/**
 * Created by gustavokm90 on 3/8/15.
 */

@Aspect
@Configuration
@EnableAspectJAutoProxy
@Import({ConfigExampleClasses.class})
public class ConfigFacade {

    private static final Logger logger = LoggerFactory.getLogger(ConfigFacade.class);


    @Bean(name = "hybridVehicle")
    public HybridVehicle hybridVehicle(Vehicle car, Vehicle boat, WhiteGoods oven){
        logger.info("SPRING - Configuring hybridVehicle bean");
        return new HybridVehicle(car,boat,oven);
    }

    @Bean(name = "car")
    public Vehicle car(){
        logger.info("SPRING - Configuring car bean under facade Configuration class");
        Vehicle vehicle = new Car();
        ((Car)vehicle).setBrand("Mazda");
        return vehicle;
    }

    /* ------- Aspect Programming ------- */


    @Before("execution(* drive*(..))")
    public void doBefore(JoinPoint joinPoint){
        logger.info("ASPECTJ - Before a drive method! "+ joinPoint.getSignature().getName());
    }

    @After("execution(* drive*(..))")
    public void doAfter(JoinPoint joinPoint){
        logger.info("ASPECTJ - After a drive method! " + joinPoint.getSignature().getName());
    }

}
