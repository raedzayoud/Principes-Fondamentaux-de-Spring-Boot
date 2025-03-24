package com.course_spring_boot.demp.Repository;

import java.rmi.server.UID;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.course_spring_boot.demp.Model.Registration;

@Repository
public class RegistrationRepository {
    private static int idGenerator = 1;

    private final Map<String, Registration> registrationsByCode = new HashMap<>();

    public Registration create(Registration registration) {
        var id = idGenerator++;
        var code = UUID.randomUUID().toString();
        var registrations = new Registration(id, registration.getTicketId(), code, registration.getAttendName());
        registrationsByCode.put(code, registrations);
        return registrations;
    }

    public Optional<Registration> findById(int id) {
        return registrationsByCode.values().stream().filter(registration -> registration.getId() == id).findFirst();
    }

    public Optional<Registration> findByCode(String ticketCode) {
        return Optional.ofNullable(registrationsByCode.get(ticketCode));
    }

    public Registration update(Registration registration, String attendeeName) {
        String code = registration.getCode();
        var registrations = new Registration(registration.getId(), registration.getTicketId(), code, attendeeName);
        registrationsByCode.put(code, registrations);
        return registrations;
    }

    public void deleteByCode(String code) {
        registrationsByCode.values().removeIf(r -> r.getCode().equals(code));
    }

}
