package com.edu.designpattern.structural.decorator;

import com.edu.common.customexceptions.LockedDoorException;
import com.edu.common.exampleclasses.concreteclasses.Door;
import com.edu.common.exampleclasses.concreteclasses.Room;
import com.edu.springconfigclasses.ConfigDecorator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

/**
 * Created by gustavokm90 on 12/23/14.
 */
public class DecoratorDesignPatternDemo {

    private static final Logger logger = LoggerFactory.getLogger(DecoratorDesignPatternDemo.class);


    public static void main(String[] args){

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ConfigDecorator.class);

        // Instantiating composite object, creating a labyrinth

        Room room1 = (Room) context.getBean("room", "Room #1",false);
        room1 = (Room) context.getBean("labyrinthroomdecorator",room1,"Blue");

        Room room2 = (Room) context.getBean("room", "Room #2",false);
        room2 = (Room) context.getBean("labyrinthroomdecorator",room2,"Red");

        Room room3 = (Room) context.getBean("room", "Room #3",false);
        room3 = (Room) context.getBean("labyrinthroomdecorator",room3,"Yellow");

        Room room4 = (Room) context.getBean("room", "Room #4",false);
        room4 = (Room) context.getBean("labyrinthroomdecorator",room4,"Purple");

        Room room5 = (Room) context.getBean("room", "Room #5",false);
        room5 = (Room) context.getBean("labyrinthroomdecorator",room5,"White");

        Room room6 = (Room) context.getBean("room", "Room #6",true);

        //Adding doors to all rooms
        Door doorA1 = (Door) context.getBean("door", room1,room2, "Door A at room #1");
        room1.addRoom(room2, doorA1);

        Door doorB1 = (Door) context.getBean("door", room1,room3, "Door B at room #1");
        room1.addRoom(room3, doorB1);

        Door doorA2 = (Door) context.getBean("door", room2,room3, "Door A at room #2");
        room2.addRoom(room3, doorA2);

        Door doorA3 = (Door) context.getBean("door", room3,room4, "Door A at room #3");
        room3.addRoom(room4, doorA3);

        Door doorA4 = (Door) context.getBean("door", room4,room5, "Door A at room #4");
        room4.addRoom(room5, doorA4);

        Door doorB4 = (Door) context.getBean("door", room5,room6, "Door B at room #4");
        room4.addRoom(room6, doorB4);


        //Walking through the lab
        Scanner scan = new Scanner(System.in);

        try {
            Room current = room1;
            int howManyDoors = 0;

            logger.info("Start walking into the lab");

            while(!current.isExit()){
                logger.info(current.getRoomName());
                howManyDoors = current.showDoors();
                System.out.print("Enter the door index number:");
                int resp = Integer.parseInt(scan.next());
                if (howManyDoors > resp) {
                    logger.info("Entering in the door " + current.getDoor(resp).getDoorName());
                    current = current.getDoor(resp).goToRoom();
                } else{
                    logger.error("Invalid door index");
                }
            }

            logger.info("Cheers! You found the Exit!!!");

        } catch (LockedDoorException e) {
            e.printStackTrace();
        }

    }

}


