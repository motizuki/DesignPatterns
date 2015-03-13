package com.edu.springconfigclasses;

import com.edu.common.exampleclasses.concreteclasses.Room;
import com.edu.designpattern.structural.decorator.LabyrinthRoomDecorator;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.*;

/**
 * Created by gustavokm90 on 3/13/15.
 */
@Aspect
@Configuration
@EnableAspectJAutoProxy
@Import({ConfigExampleClasses.class})
public class ConfigDecorator {
    private static final Logger logger = LoggerFactory.getLogger(ConfigDecorator.class);

    @Bean(name = "labyrinthroomdecorator")
    @Scope("prototype")
    public LabyrinthRoomDecorator labyrinthRoomDecorator(Room room, String color){
        logger.info("SPRING - Configuring labyrinthRoomDecorator bean");
        return new LabyrinthRoomDecorator(room,color);
    }

}
