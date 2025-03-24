package com.course_spring_boot.demp.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.course_spring_boot.demp.Model.Event;
import com.course_spring_boot.demp.Model.Locations;
import com.course_spring_boot.demp.Model.Organiser;

@Repository
public class EventRepository {

    private final List<Event> events = List.of(
            new Event(
                    501,
                    "Oracle Code One",
                    new Organiser(101, "Oracle", "Software company"),
                    new Locations(201, "Java Street 123", "San Francisco", "California USA"),
                    LocalDate.of(2023, 12, 15),
                    LocalDate.of(2023, 12, 15)),
            new Event(
                    502,
                    "Google I/O",
                    new Organiser(102, "Google", "Technology company"),
                    new Locations(202, "Googleplex", "Mountain View", "California USA"),
                    LocalDate.of(2024, 1, 15),
                    LocalDate.of(2024, 1, 15)),
            new Event(
                    503,
                    "Apple WWDC",
                    new Organiser(103, "Apple", "Technology company"),
                    new Locations(203, "Apple Park", "Cupertino", "California USA"),
                    LocalDate.of(2024, 2, 15),
                    LocalDate.of(2024, 2, 15)));

    public Optional<Event> findById(Integer id) {
        return events.stream().filter(event -> event.getId() == id).findFirst();
    }

    public List<Event> findByOrganizerId(Integer organizerId) {
        return events.stream().filter(event -> event.getOrganiser().getId() == organizerId).toList();
    }

}
