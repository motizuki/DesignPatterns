package com.edu.springconfigclasses;

import com.edu.common.exampleclasses.*;
import com.edu.common.exampleclasses.concreteclasses.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by gustavokm90 on 3/12/15.
 */
@Configuration
public class ConfigExampleClasses {

    private static final Logger logger = LoggerFactory.getLogger(ConfigExampleClasses.class);

    @Bean(name = "car")
    public Vehicle car(){
        logger.info("SPRING - Configuring car bean");
        return new Car();
    }
    @Bean(name = "boat")
    public Vehicle boat(){
        logger.info("SPRING - Configuring boat bean");
        return new Boat();
    }
    @Bean(name = "oven")
    public WhiteGoods oven(){
        logger.info("SPRING - Configuring oven bean");
        return new Oven();
    }
    @Bean(name = "advancedCar")
    public AdvancedVehicle advancedCar(){
        logger.info("SPRING - Configuring advancedCar");
        return new AdvancedCar("advCar");
    }
    @Bean(name = "fridge")
    public WhiteGoods fridge(){
        logger.info("SPRING - Configuring fridge");
        return new Fridge();
    }

    @Bean(name = "door")
    @Scope("prototype")
    public Door door(Room current, Room direction, String doorName){
        logger.info("SPRING - Configuring door");
        return new Door(current,direction,doorName);
    }
    @Bean(name = "door")
    @Scope("prototype")
    public Door door(Room current, Room direction, String secret, String doorName){
        logger.info("SPRING - Configuring door with secret");
        return new Door(current,direction,secret,doorName);
    }

    @Bean(name = "room")
    @Scope("prototype")
    public Room room(String roomName, boolean exit){
        logger.info("SPRING - Configuring Room");
        return new Room(roomName,exit);
    }
}
