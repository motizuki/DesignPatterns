package com.edu.DesignPattern.Structural.Composite;

import com.edu.common.lab.Door;
import com.edu.common.lab.Room;

/**
 * Created by gustavokm90 on 12/23/14.
 */
public class CompositeDesignPatternDemo {

    public static void main(String[] args){


        // Instantiating composite object, creating a labyrinth

        Room firstRoom = new Room("First Room");
        Room finalRoom = new Room("Final Room",true);

        Door secondDoor = firstRoom.addNewRoom("Second Room", "Door 0");
        Door thirdDoor = firstRoom.addNewRoom("Third Room", "Door 1");

        Door fourthDoor = secondDoor.getDirection().addNewRoom("Fourth Room", "Door 0");

        Door fifthDoor = thirdDoor.getDirection().addNewRoom("Fifth Room","Door 0");

        Door finalDoor = fifthDoor.getDirection().addRoom(finalRoom, "Final Door");

        //Walking through the lab

        firstRoom.getRoomName();
        firstRoom.showDoors();

        secondDoor.getDirection().getRoomName();
        secondDoor.getDirection().showDoors();

        fourthDoor.getDirection().getRoomName();
        fourthDoor.getDirection().showDoors();

        thirdDoor.getDirection().getRoomName();
        thirdDoor.getDirection().showDoors();

        fifthDoor.getDirection().getRoomName();
        fifthDoor.getDirection().showDoors();

        finalDoor.getDirection().getRoomName();
        finalDoor.getDirection().showDoors();




    }

}


