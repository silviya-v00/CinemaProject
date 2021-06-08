package com.pgrss.Cinema.Repositories.Cinema;

import com.pgrss.Cinema.entities.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CinemaRepository extends JpaRepository<Cinema,Long>
{
    @Query("SELECT a FROM Cinema a WHERE lower(a.name) = :name ")
    Optional<Cinema>  findCinemaByName(String name);
}
