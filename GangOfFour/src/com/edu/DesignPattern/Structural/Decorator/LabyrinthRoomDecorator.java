package com.edu.DesignPattern.Structural.Decorator;

import com.edu.common.lab.Room;

/**
 * Created by gustavokm90 on 12/27/14.
 */
public class LabyrinthRoomDecorator extends Room {

    protected Room room;
    private String color;

    public LabyrinthRoomDecorator(Room room, String color) {
        super();
        this.color = color;
        this.room = room;
    }

    public void paintRoom(String color){
        this.color = color;
        System.out.println("Room painted in "+color);
    }
    public String getColor(){
        return this.color;
    }

    @Override
    public void getRoomName(){
        System.out.print(this.color +" -- ");
        this.room.getRoomName();
    }

}
