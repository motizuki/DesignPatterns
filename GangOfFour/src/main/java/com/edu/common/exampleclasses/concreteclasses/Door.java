package com.edu.common.exampleclasses.concreteclasses;

import com.edu.common.customexceptions.LockedDoorException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gustavokm90 on 12/26/14.
 */
public class Door {

    private static final Logger logger = LoggerFactory.getLogger(Door.class);

    private boolean locked;
    private String secret;
    private String doorName;
    //composite object
    private Room direction;
    private Room current;

    public Door(Room current, Room direction, String secret, String doorName) {
        this.current = current;
        this.secret = secret;
        this.direction = direction;
        this.doorName = doorName;
    }

    public Door(Room current, Room direction, String doorName) {
        this.current = current;
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

    public String getDirection(){
        return direction.getRoomName();
    }

    public String getDoorName(){
        return doorName;
    }

    public Room goToRoom() throws LockedDoorException {
        if (!locked) return direction;
        else throw new LockedDoorException("Unable to go, Door locked");
    }

    public Room goBack() {
        return current;
    }


}
