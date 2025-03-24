package com.course_spring_boot.demp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course_spring_boot.demp.Model.Organiser;
import com.course_spring_boot.demp.Repository.OrganiserRepository;

@Service
public class OrganiserService {

    @Autowired
    OrganiserRepository organiserRepository;

    public List<Organiser> findAll() {
        return organiserRepository.findAll();
    }

}
