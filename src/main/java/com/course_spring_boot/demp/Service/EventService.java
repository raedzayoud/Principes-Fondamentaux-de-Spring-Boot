package com.course_spring_boot.demp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course_spring_boot.demp.Model.Event;
import com.course_spring_boot.demp.Repository.EventRepository;

@Service
public class EventService {

    @Autowired
    EventRepository eventRepository;

    public Event FindById(int id) {
        return eventRepository.findById(id).orElse(null);
    }

    public List<Event> findByOrganiserId(int id) {
        return eventRepository.findByOrganizerId(id);
    }

}
