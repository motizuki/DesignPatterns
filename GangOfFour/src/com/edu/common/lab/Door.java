package com.edu.common.lab;

/**
 * Created by gustavokm90 on 12/26/14.
 */
public class Door {

    private boolean locked;
    private String secret;
    private String doorName;
    //composite object
    private Room direction;

    public Door(Room direction, String secret, String doorName) {
        this.secret = secret;
        this.direction = direction;
        this.doorName = doorName;
    }

    public Door(Room direction, String doorName) {
        this.secret = "";
        this.direction = direction;
        this.doorName = doorName;
    }

    public boolean openDoor(String secret){
        this.locked = secret.equals(this.secret);
        return this.locked;
    }

    public boolean openDoor(){
        this.locked = this.secret.isEmpty();
        return this.locked;
    }

    public Room getDirection(){
        return direction;
    }

    public void getDoorName(){
        System.out.println(doorName);
    }

    public Room goToRoom() throws LockedDoorException{
        if (!locked) return direction;
        else throw new LockedDoorException("Unable to go, Door locked");
    }

}
