package com.pgrss.Cinema.controllers;

import com.pgrss.Cinema.Repositories.Cinema.FilmsRepository;
import com.pgrss.Cinema.entities.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("film")
public class FilmController {

    @Autowired
    FilmsRepository filmsRepository;

    @GetMapping("/all")
    public List<Film> getAllFilms ()
    {
        return filmsRepository.findAll();
    }
}
