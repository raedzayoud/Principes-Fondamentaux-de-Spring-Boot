package com.course_spring_boot.demp.Service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course_spring_boot.demp.Model.Registration;
import com.course_spring_boot.demp.Repository.RegistrationRepository;

@Service
public class RegistrationService {
    @Autowired
    RegistrationRepository registrationRepository;

    public Registration create(Registration registration) {
        return registrationRepository.create(registration);
    }

    public Registration findById(int id) {
        return registrationRepository.findById(id).orElse(null);
    }

    public Registration findByCode(String ticketCode) {
        return registrationRepository.findByCode(ticketCode).orElse(null);
    }

    public Registration update(Registration registration) {
        String code = registration.getCode();
        var exsitsRegistration = findByCode(code);
        return registrationRepository.update(exsitsRegistration, code);

    }

    public void deleteByCode(String code) {
        registrationRepository.deleteByCode(code);
    }

}
