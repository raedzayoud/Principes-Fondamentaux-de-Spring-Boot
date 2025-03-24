package com.course_spring_boot.demp.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.course_spring_boot.demp.Model.Locations;

@Repository
public class LocationRepository {
    private final List<Locations> locationss = List.of(
            new Locations(201, "Java Street 123", "San Francisco", "California USA"),
            new Locations(202, "Googleplex", "Mountain View", "California USA"),
            new Locations(203, "Apple Park", "Cupertino", "California USA"));

    public Optional<Locations> findById(Integer id) {
        return locationss.stream().filter(locations -> locations.getId() == id).findFirst();
    }

}
