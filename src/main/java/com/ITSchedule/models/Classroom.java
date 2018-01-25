package com.ITSchedule.models;

import org.springframework.data.annotation.Id;

public class Classroom {
    @Id
    private String id;
    private int numbOfPlaces;
}
