package com.course_spring_boot.demp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course_spring_boot.demp.Model.Ticket;
import com.course_spring_boot.demp.Repository.TicketRepository;

@Service
public class TicketService {
    @Autowired
    TicketRepository ticketRepository;

    public List<Ticket> findByEventId(int id) {
        return ticketRepository.findByEventId(id);
    }

}
