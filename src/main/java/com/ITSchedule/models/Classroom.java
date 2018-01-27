package com.ITSchedule.models;

import org.springframework.data.annotation.Id;

public class Classroom {
    @Id
    private String id;
    private int numbOfPlaces;

    public Classroom(String id, int numbOfPlaces){
        this.id = id;
        this.numbOfPlaces = numbOfPlaces;
    }
}
