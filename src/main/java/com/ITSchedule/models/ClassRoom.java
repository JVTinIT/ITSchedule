package com.ITSchedule.models;

import org.springframework.data.annotation.Id;

public class ClassRoom {
    @Id
    private String id;
    private int numbOfPlaces;

    public ClassRoom(int numbOfPlaces){
        this.numbOfPlaces = numbOfPlaces;
    }
}
