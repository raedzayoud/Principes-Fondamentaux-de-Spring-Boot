package com.course_spring_boot.demp.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course_spring_boot.demp.Model.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Integer> {

    Optional<Registration> findByCode(String ticketCode);

    void deleteByCode(String code);
}
