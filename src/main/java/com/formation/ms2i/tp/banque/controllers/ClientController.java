package com.formation.ms2i.tp.banque.controllers;

import com.formation.ms2i.tp.banque.entities.Client;
import com.formation.ms2i.tp.banque.entities.Compte;
import com.formation.ms2i.tp.banque.repository.ClientRepository;
import com.formation.ms2i.tp.banque.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

@RestController
public class ClientController {
    @Autowired
    ClientRepository clientRepository;

    @Autowired
    CompteRepository compteRepository;

    @GetMapping("/clients")
    public List<Client> allClients() {
        return clientRepository.findAll();
    }

    @PostMapping("/clients/{id}/compte")
    public void createClient(@RequestBody Compte newAccount, @PathVariable long id) {
        Optional<Client> client = clientRepository.findById(id);
        if (client.isPresent()) {
            client.get().addComptes(new HashSet(Arrays.asList(newAccount)));
            clientRepository.save(client.get());
        }
    }

    @PostMapping("/clients/{solde}")
    public Object createClient(@RequestBody Client client,@PathVariable long solde) {
        client.addComptes(new HashSet(Arrays.asList(new Compte(solde))));
        clientRepository.save(client);
        return client;
    }
}
