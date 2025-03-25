package com.course_spring_boot.demp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course_spring_boot.demp.Model.Registration;
import com.course_spring_boot.demp.Service.RegistrationService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/registration")
public class RegistrationController {

    @Autowired
    RegistrationService registrationService;

    @PostMapping("/create")
    public Registration create(@RequestBody @Valid Registration registration) {
        return registrationService.create(registration);
    }

    @GetMapping("/{id}")
    public Registration findById(@PathVariable("id") int id) {
        return registrationService.findById(id);
    }

    @GetMapping("/code/{code}")
    public Registration findByCode(@PathVariable("code") String ticketCode) {
        return registrationService.findByCode(ticketCode);
    }

    @PutMapping("/update")
    public Registration updated(@RequestBody Registration registration) {
        return registrationService.update(registration);

    }

    @DeleteMapping("/delete/{code}")
    public void deleteByCode(@PathVariable("code") String code) {
        registrationService.deleteByCode(code);
    }

}
