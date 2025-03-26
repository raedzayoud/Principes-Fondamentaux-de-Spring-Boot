package com.course_spring_boot.demp.Service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course_spring_boot.demp.Model.Registration;
import com.course_spring_boot.demp.Repository.RegistrationRepository;

@Service
public class RegistrationService {
    @Autowired
    RegistrationRepository registrationRepository;

    public Registration create(Registration registration) {
        return registrationRepository.save(registration);
    }

    public Registration findById(int id) {
        return registrationRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Registration with id not found"));
    }

    public Registration findByCode(String ticketCode) {
        return registrationRepository.findByCode(ticketCode)
                .orElseThrow(() -> new NoSuchElementException("Registration with code not found"));
    }

    public Registration update(Registration registration) {
        if (registration == null || registration.getCode() == null) {
            throw new IllegalArgumentException("Registration object or code cannot be null");
        }

        String code = registration.getCode();
        var existsRegistration = findByCode(code);

        if (existsRegistration == null) {
            throw new IllegalArgumentException("No registration found with code: " + code);
        }
        var updatRegistration = new Registration(existsRegistration.getId(), existsRegistration.getTicketId(), code,
                existsRegistration.getAttendName());
        return registrationRepository.save(updatRegistration);
    }

    public void deleteByCode(String code) {
        registrationRepository.deleteByCode(code);
    }

}
