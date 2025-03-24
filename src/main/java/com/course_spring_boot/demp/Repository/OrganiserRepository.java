package com.course_spring_boot.demp.Repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.course_spring_boot.demp.Model.Organiser;

@Repository
public class OrganiserRepository {
    private final List<Organiser> organizers = List.of(
            new Organiser(101, "Oracle", "Software company"),
            new Organiser(102, "Google", "Technology company"),
            new Organiser(103, "Apple", "Technology company"));

    public List<Organiser> findAll() {
        return organizers;
    }

}
