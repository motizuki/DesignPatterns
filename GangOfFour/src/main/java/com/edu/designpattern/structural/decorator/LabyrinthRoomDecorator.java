package com.edu.designpattern.structural.decorator;

import com.edu.common.exampleclasses.concreteclasses.Room;

/**
 * Created by gustavokm90 on 12/27/14.
 */
public class LabyrinthRoomDecorator extends Room {

    private String color;

    public LabyrinthRoomDecorator(Room room, String color) {
        super(room.getRoomName(),room.isExit());
        this.color = color;
    }

    public String paintRoom(String color){
        this.color = color;
        return "Room painted in "+color;
    }
    public String getColor(){
        return this.color;
    }

    @Override
    public String getRoomName(){
        return this.color +" -- "+this.roomName;

    }

}
