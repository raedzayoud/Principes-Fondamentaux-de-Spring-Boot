package com.course_spring_boot.demp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course_spring_boot.demp.Model.Locations;

@Repository
public interface LocationRepository extends JpaRepository<Locations, Integer> {

}
