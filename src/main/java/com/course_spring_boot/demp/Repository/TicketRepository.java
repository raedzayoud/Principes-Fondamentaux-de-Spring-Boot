package com.course_spring_boot.demp.Repository;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.course_spring_boot.demp.Model.Ticket;

@Repository
public class TicketRepository {
    private final List<Ticket> tickets = List.of(
            new Ticket(801, 501, "Standard", "Standard Conference Ticket", 499.00),
            new Ticket(802, 501, "Premium", "Premium Conference Ticket", 649.00),
            new Ticket(803, 502, "Standard", "Developer Day Ticket", 195.50),
            new Ticket(804, 503, "Regular", "Regular Entrance", 35.00),
            new Ticket(805, 503, "VIP", "VIP Bonus Entrance", 65.00));

    public List<Ticket> findByEventId(int eventId) {
        return tickets.stream().filter(ticket -> ticket.getId() == eventId).toList();
    }
}
