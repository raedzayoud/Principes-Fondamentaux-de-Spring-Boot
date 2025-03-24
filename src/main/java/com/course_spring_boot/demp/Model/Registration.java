package com.course_spring_boot.demp.Model;

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
    private int ticketId;
    private String code;
    private String attendName;
}
