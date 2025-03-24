package com.course_spring_boot.demp.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Ticket {

    private int id;
    private int eventId;
    private String name;
    private String description;
    private double price;

}
