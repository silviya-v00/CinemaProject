package com.pgrss.Cinema.Repositories.Cinema;

import com.pgrss.Cinema.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client,Long>
{
    @Query("SELECT c FROM Client c WHERE lower(c.holder_first_name) = :holder_first_name ")
    Optional<Client>  findClientByName (String holder_first_name);
}