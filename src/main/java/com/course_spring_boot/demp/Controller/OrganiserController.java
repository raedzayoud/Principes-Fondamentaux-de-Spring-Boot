package com.course_spring_boot.demp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course_spring_boot.demp.Model.Organiser;
import com.course_spring_boot.demp.Service.OrganiserService;

@RestController
@RequestMapping("/api/organiser")
public class OrganiserController {

    @Autowired
    private OrganiserService organiserService;

    @GetMapping
    public List<Organiser> organisers() {
        return organiserService.findAll();
    }

}