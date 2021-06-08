package com.pgrss.Cinema.controllers;

import com.pgrss.Cinema.entities.Cinema;
import com.pgrss.Cinema.Repositories.Cinema.CinemaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("cinema")

public class CinemaController {
    @Autowired
    CinemaRepository cinemaRepository;

    @GetMapping("/all")
    public List<Cinema> getAllCinemas ()
    {
    return cinemaRepository.findAll();
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveCinema(@RequestParam(required = false) Long id,
                                        @RequestParam(required = false) String name,
                                        @RequestParam(required = false) String city,
                                        @RequestParam(required = false) String street_name,
                                        @RequestParam(required = false) Integer street_num){
       boolean isNew = id == null;

       Cinema cinema = new Cinema(id,name,street_num,street_name,city);
       cinema = cinemaRepository.save(cinema);
       Map<String, Object> response = new HashMap<>();
       response.put("generatedId", cinema.getId());
       if (isNew){
           response.put("message", "Успешно записан!");}
       else {
           response.put("message", "Успешно редактиран!");}


        return new ResponseEntity<>(response, HttpStatus.OK);

    }


    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteCinema(@RequestParam Long id) {

        if(!cinemaRepository.existsById(id))
        {
            return ResponseEntity.ok("Няма такъв човек!");
        }

        cinemaRepository.deleteById(id);
        return ResponseEntity.ok("Изтрит успешно!");
    }

    @GetMapping("/search")
    public ResponseEntity getCinema (@RequestParam(required = false) String name)
    {
        if(name == null || name.isBlank()) {
            return ResponseEntity.ok().body("Не сте въвели име!");
        }

        Optional<Cinema> result = cinemaRepository.findCinemaByName(name.toLowerCase());
        return result.isPresent()? ResponseEntity.ok(result.get()):ResponseEntity.ok("Няма намерен човек!");

    }
}
