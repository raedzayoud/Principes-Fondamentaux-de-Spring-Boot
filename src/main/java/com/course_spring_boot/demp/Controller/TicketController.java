package com.course_spring_boot.demp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course_spring_boot.demp.Model.Ticket;
import com.course_spring_boot.demp.Service.TicketService;

@RestController
@RequestMapping("/api/ticket")
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @GetMapping("/{eventId}")
    public List<Ticket> findByEventId(@PathVariable("eventId") int eventId) {
        return ticketService.findByEventId(eventId);
    }

}
