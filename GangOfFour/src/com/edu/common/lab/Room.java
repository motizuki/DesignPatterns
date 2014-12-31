package com.edu.common.lab;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gustavokm90 on 12/25/14.
 */
public class Room {

    //composite object
    private List<Door> doors = new ArrayList<Door>();
    private String roomName;
    private boolean exit;

    protected Room(){

    }

    public Room(String roomName) {
        this.roomName = roomName;
    }

    public Room(String roomName, boolean exit) {
        this.roomName = roomName;
        this.exit = exit;
    }

    public void getRoomName(){
        System.out.println(roomName);
    }

    public Door addNewRoom(String roomName, String doorName){
        Door door = new Door(new Room(roomName), doorName);
        door.getDirection().doors.add(new Door(this, "BackDoor"));
        doors.add(door);
        return door;
    }

    public Door addRoom(Room room, String doorName){
        Door door = new Door(room,doorName);
        room.doors.add(new Door(this, "BackDoor"));
        doors.add(door);
        return door;
    }

    public void removeDoor(int index){
        doors.remove(index);
    }

    public Door getDoor(int index){
        return doors.get(index);
    }

    public Room goToRoom(int index) throws LockedDoorException{
        return doors.get(index).goToRoom();
    }

    public void showDoors(){
        for (int index = 0 ; index < doors.size(); index++){
            doors.get(index).getDoorName();
        }
    }

}
