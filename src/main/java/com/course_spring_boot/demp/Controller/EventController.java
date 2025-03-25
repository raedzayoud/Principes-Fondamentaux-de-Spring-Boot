package com.course_spring_boot.demp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course_spring_boot.demp.Model.Event;
import com.course_spring_boot.demp.Service.EventService;

@RestController
@RequestMapping("/api/event")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping("/organ/{organsierId}")
    public List<Event> findByOrganiserId(@PathVariable("organsierId") int organsierId) {
        return eventService.findByOrganiserId(organsierId);
    }

    @GetMapping("/{eventId}")
    public Event findById(@PathVariable("eventId") int eventId) {
        return eventService.findById(eventId);
    }

}
