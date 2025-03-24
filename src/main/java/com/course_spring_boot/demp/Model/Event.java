package com.course_spring_boot.demp.Model;

import java.time.LocalDate;

import org.springframework.beans.factory.parsing.Location;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Event {
    private int id;
    private String name;
    private Organiser organiser;
    private Locations location;
    private LocalDate startDate;
    private LocalDate endDate;

}
