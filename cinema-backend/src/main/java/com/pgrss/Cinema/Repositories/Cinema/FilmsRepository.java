package com.pgrss.Cinema.Repositories.Cinema;

import com.pgrss.Cinema.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface FilmsRepository extends JpaRepository<Film,Long>
{
    @Query("SELECT f FROM Film f WHERE lower(f.name) = :name ")
    Optional<Film>findFilmByName(String name);
}