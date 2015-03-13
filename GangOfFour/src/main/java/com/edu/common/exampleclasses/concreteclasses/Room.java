package com.edu.common.exampleclasses.concreteclasses;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gustavokm90 on 12/25/14.
 */
public class Room {

    private static final Logger logger = LoggerFactory.getLogger(Room.class);

    //composite object
    private List<Door> doors = new ArrayList<Door>();
    protected String roomName;
    private boolean exit;

    public Room(String roomName) {
        this.roomName = roomName;
    }

    public Room(String roomName, boolean exit) {
        this.roomName = roomName;
        this.exit = exit;
    }

    public boolean isExit() {
        return exit;
    }

    public String getRoomName(){
        return roomName;
    }

    public Door addRoom(Room room, Door door){
        room.doors.add(new Door(room,door.goBack(),"Backdoor"));
        doors.add(door);
        return door;
    }

    public void removeDoor(int index){
        doors.remove(index);
    }

    public Door getDoor(int index){
        return doors.get(index);
    }

    public int showDoors(){
        for (int index = 0 ; index < doors.size(); index++){
            logger.info(doors.get(index).getDoorName() +" at index "+index);
        }
        return doors.size();
    }

}
