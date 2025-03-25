package com.course_spring_boot.demp.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course_spring_boot.demp.Model.Event;
import com.course_spring_boot.demp.Repository.EventRepository;

@Service
public class EventService {

    @Autowired
    EventRepository eventRepository;

    public Event findById(int id) {
        return eventRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Event with  not found"));
    }

    public List<Event> findByOrganiserId(int id) {
        return eventRepository.findByOrganizerId(id);
    }

}
