package com.manik.location.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.manik.location.enities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
