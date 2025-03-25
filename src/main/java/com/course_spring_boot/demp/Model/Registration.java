package com.course_spring_boot.demp.Model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Registration {
    private int id;
    private @NotNull(message = "TicketId is required") int ticketId;
    private String code;
    // not vide=not blank
    private @NotBlank(message = "Attendee name is required") String attendName;
}
