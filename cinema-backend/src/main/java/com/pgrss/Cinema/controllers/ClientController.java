package com.pgrss.Cinema.controllers;

import com.pgrss.Cinema.entities.Cinema;
import com.pgrss.Cinema.Repositories.Cinema.ClientRepository;

import com.pgrss.Cinema.entities.Client;
import com.pgrss.Cinema.entities.Film;
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
@RequestMapping("client")

public class ClientController {
    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/allClients")
    public List<Client> getAllClients()
    {
        return clientRepository.findAll();
    }

    @PostMapping("/addClient/save")
    public ResponseEntity<?> saveClient(@RequestBody Client form){
        boolean isNew = form.getHolder_first_name() == null;
        Client client = clientRepository.save(form);
        Map<String, Object> response = new HashMap<>();
        response.put("generatedId", client.getHolder_first_name());
        if (isNew){
            response.put("message", "Успешно записан!");}
        else {
            response.put("message", "Успешно редактиран!");}


        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/addClient")
    public ResponseEntity<?> saveOrUpdate (@RequestParam(required = false) Long id,
                                         @RequestParam(required = false) Double price,
                                @RequestParam(required = false) String holder_first_name,
                                @RequestParam(required = false) String holder_last_name,
                                @RequestParam(required = false) String email,
                                @RequestParam(required = false) Integer count_tickets,
                                           @RequestParam(required = false) String date,
                                           @RequestParam(required = false) String type){


        boolean isNew = id == null;

        Client client = new Client(id, price, holder_first_name, holder_last_name, email, count_tickets, date, type);
        client = clientRepository.save(client);
        Map<String, Object> response = new HashMap<>();
        response.put("generatedId", client.getHolder_first_name());
        if (isNew){
            response.put("message", "Успешно записан!");}
        else {
            response.put("message", "Успешно редактиран!");}


        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
