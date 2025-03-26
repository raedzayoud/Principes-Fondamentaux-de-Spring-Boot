package com.course_spring_boot.demp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course_spring_boot.demp.Model.Organiser;

@Repository
public interface OrganiserRepository extends JpaRepository<Organiser, Integer> {

}
